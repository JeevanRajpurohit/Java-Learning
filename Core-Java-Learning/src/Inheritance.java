class A{
    public A(){
        super();
        System.out.println("I am default A");
    }
    public A(int a){
        super();
        System.out.println("I am parameter A");
    }
    public void show(){
        System.out.println("I am Parent class");
    }
}
class B extends A{
    public B(){
        super(10);
        System.out.println("I am default B");
    }
    public B(int a){
        this();
        System.out.println("I am Parameter B");
    }
    public void show1(){
        System.out.println("I am a child class");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        //B obj = new B(5);
        A obj = (A) new B();
         obj.show();
    }
}
