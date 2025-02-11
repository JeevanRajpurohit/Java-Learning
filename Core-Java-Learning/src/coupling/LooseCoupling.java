package coupling;

public class LooseCoupling {
    public static void main(String[] args) {
        Car c1 = new Car(new PetrolEngine());
        c1.move();
        Car c2 = new Car(new DieselEngine());
        c2.move();
    }
}
