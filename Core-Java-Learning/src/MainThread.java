//class A extends Thread{
class A implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }


//}
class B implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class MainThread {
    public static void main(String[] args) {
//        A obj1= new A();    using thread
//        B obj2= new B();
//        Runnable obj1 = new A();
        Runnable obj1 = () -> {   //using lambda expression
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = new B();

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);

        t1.start();
        t2.start();
        System.out.println(obj1.getPriority());  // get priority
        obj2.setPriority(Thread.MAX_PRIORITY);  //set priority of thread
        obj1.start();
        obj2.start();

    }
}
