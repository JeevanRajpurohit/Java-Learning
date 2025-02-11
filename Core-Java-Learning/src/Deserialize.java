import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream f1 = new FileInputStream("file.txt");
            ObjectInputStream o1 = new ObjectInputStream(f1);

            SerilizationLearning obj1 = (SerilizationLearning) o1.readObject();  // typecasting to serilize class for deserilization. read from byte data from File.txt
            obj1.display();
            System.out.println(obj1.getName());
            System.out.println(obj1.getEmail());
            System.out.println(obj1.getAge());
            System.out.println(obj1.getAddress());
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
