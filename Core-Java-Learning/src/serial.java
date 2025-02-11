import java.io.*;

public class serial {
    public static void main(String[] args) {
        try {
            //creating object of class.

            SerilizationLearning obj = new SerilizationLearning("Jeevan Rajpurohit", "jeevanpurohit11@gmail.com", 22, "SinduBhavan");

            //write data to file.
            FileOutputStream f1 = new FileOutputStream("file.txt");

            ObjectOutputStream o1 = new ObjectOutputStream(f1);

            //how to serialize
            o1.writeObject(obj);

            f1.close();
            o1.close();
            System.out.println("Object states is transfered to file Object");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
