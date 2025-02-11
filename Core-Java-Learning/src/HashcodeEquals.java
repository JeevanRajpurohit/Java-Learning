import java.util.Objects;

//class Laptop{
//    public static Laptop MacBook;
//    String model;
//    int price;
//    public String toString(){
//        return model+ " "+ price;
//    }
////    public boolean equals(Laptop that){   // not preferable to implement this
////        return (this.model.equals(that.model) && (this.price == that.price)); // integer value cannot be checking by equals keyword
////    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Laptop laptop = (Laptop) o;
//        return price == laptop.price && Objects.equals(model, laptop.model);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(model, price);
//    }
//}
//public class HashcodeEquals {
//    public static void main(String[] args) {
//        Laptop obj1= new Laptop();
//        obj1.model="Lenovo Yoga";
//        obj1.price=1000;
//
//        Laptop obj2= new Laptop();
//        obj2.model="Lenovo Yoga";
//        obj2.price=1000;
//
//        boolean result= obj1.equals(obj2);
//        System.out.println(result);
//
//    }
//}
