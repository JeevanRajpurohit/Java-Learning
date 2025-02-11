import java.io.*;
class data implements Serializable{
    public int age;
    public String name;
    transient  int salary=10000;
    data(int age,String name)
    {
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString(){
        return "Age:"+ this.age + "\n" +"Name:"+this.name+ " "+this.salary;
    }
}
public class Main1 {
    public static void main(String[] args) {
        data data=new data(22,"Dhruv");

        data.salary=100000;
        String filename="data.ser";
        try{
            FileOutputStream file=new FileOutputStream(filename);
            ObjectOutputStream objo=new ObjectOutputStream(file);

            objo.writeObject(data);

            objo.close();
            file.close();

            System.out.println("Data saved successfully");
        }catch (FileNotFoundException e)
        {
            System.out.println("problem in the file output stream");
        }
        catch (IOException e)
        {
            System.out.println("problem in the object output stream");
        }

        data recieved;

        try{
            FileInputStream file=new FileInputStream(filename);
            ObjectInputStream objo=new ObjectInputStream(file);

            recieved=(data)objo.readObject();

            objo.close();
            file.close();

            System.out.println("Data recieved successfully");
            System.out.println(recieved);

        }catch (ClassNotFoundException e)
        {
            System.out.println("problem in the file output stream");
        }
        catch (IOException e)
        {
            System.out.println("problem in the object output stream");
        }

    }
}