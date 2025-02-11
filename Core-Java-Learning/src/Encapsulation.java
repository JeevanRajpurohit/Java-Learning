class Human{
    private int age;
    private String name;
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
         Human obj= new Human();
         obj.setAge(20);
         obj.setName("Jeevan");
         System.out.print(obj.getName()+" :" +obj.getAge());
    }
}
