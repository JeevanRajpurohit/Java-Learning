enum Laptop{
//    Running, Failed, Pending, Success;
    MacBook(2000),XPC(1000),Surface();
    private int price;
    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class Enum {
    public static void main(String[] args) {
        Status s= Status.Running;
        switch(s){
            case Running :
                System.out.println("All Good");
                break;
            case Pending:
                System.out.println("All pending");
                break;
            case Success:
                System.out.println("All Success");
                break;
            case Failed:
                System.out.println("All Failed");
                break;
        }
        Laptop lap = Laptop.MacBook;
        System.out.println(lap+ " : "+ lap.getPrice());

         for(Laptop lap : Laptop.values()){
             System.out.println(lap + " : "+ lap.getPrice());
         }

    }
}
