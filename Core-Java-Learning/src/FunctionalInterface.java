//@java.lang.FunctionalInterface
//interface A{
//    void show(int i);
//    int add(int i,int j);
//}
//class B implements A{
//    public void show(){
//        System.out.println("in B shows");
//    }
//}
//public class FunctionalInterface {
//    public static void main(String[] args) {
//        A obj = new A(){
//          public void show(){
//              System.out.println("in SHow A");
//          }
//        };
//        A obj = (i) -> {   // automatically it will take all thing , because in FI their we have only one method.
//            System.out.println("in show A"+ i);
//        };
//        A obj = (i,j) -> i+j;            // or for multiple line we can write as return i+j;
//        int ans= obj.add(5,4);
//        System.out.println(ans);
//    }
//}
