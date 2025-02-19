package realWorldExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{

}
@Component
@Lazy
class ClassB{
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Some Initialization happen.");
        this.classA = classA;
    }
    public void doYourWork(){
        System.out.println("Lazily you  are calling.");
    }
}

@Configuration
@ComponentScan
public class LazyAndEagerIntialization {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(LazyAndEagerIntialization.class)){
            context.getBean(ClassB.class).doYourWork();
        }
    }
}
