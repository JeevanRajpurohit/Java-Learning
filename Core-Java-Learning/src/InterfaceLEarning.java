import java.lang.FunctionalInterface;

@FunctionalInterface
interface abc{
    void show1();
    static void show(){
        System.out.println("Hi From abc");
    }
    static void show2(){
        System.out.println("Hi From abc 2");
    }

}
class B implements abc{

    @Override
    public void show1() {
        System.out.println("in class B");
    }
}
public class InterfaceLEarning {
    public static void main(String[] args) {
        abc obj = new B();
        abc.show2();
    }
}
