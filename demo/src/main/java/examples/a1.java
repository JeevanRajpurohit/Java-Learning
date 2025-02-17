package examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass{

 //  @Autowired                       //field dependency injection.
     Dependency1 dependency1;
   // @Autowired
     Dependency2 dependency2;

   //  @Autowired  here in Constructor injection we can not add to @Autowired. still work
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        System.out.println("Constructor Injection YourBusinessClass");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;

    }
//     @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//         System.out.println("Setter Injection -setDependency1");
//        this.dependency1 = dependency1;
//    }
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("Setter Injection -setDependency2");
//         this.dependency2 = dependency2;
//    }

    public String toString(){
         return "Using " + dependency1 + " and " + dependency2;
     }
}
@Component
class Dependency1{

}
@Component
class Dependency2{

}

@Component
@ComponentScan
public class a1 {
    public static void main(String[] args) {
        try(var Context =new AnnotationConfigApplicationContext(a1.class)){
            Arrays.stream(Context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(Context.getBean(YourBusinessClass.class));
        }
    }
}
