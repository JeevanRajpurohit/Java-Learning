 class A{
    public void show1(){
        System.out.println("Hello From Parent Class");
    }

   // public abstract void show1();
}
class B extends A{
    @Override
    public void show1(){
        System.out.println("Hello from Child class");
    }
}
public class Annotation {
    public static void main(String[] args) {
        B obj = new A();
        obj.show1();
    }
}
