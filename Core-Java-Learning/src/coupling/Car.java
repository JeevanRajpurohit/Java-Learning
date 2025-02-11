package coupling;

public class Car {
    Engine e;
    Car(Engine e){
        this.e=e;
    }
    void move(){
        System.out.println("Car moves with :");
        e.show();
    }
}
//tight couplpling  // our car class is depend on Petrol class object
//public class Car {
//    PetrolEngine e;
//    Car(PetrolEngine e){
//        PetrolEngine.e=e;
//    }
//    void move(){
//        System.out.println("Car moves with :");
//        e.show();
//    }
//}