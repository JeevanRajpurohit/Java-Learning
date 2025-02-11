 class box<T> {
    T container;
    public box(T container){
        this.container=container;
    }
    public void performSomTask(){
        if(container instanceof String){
            System.out.println("THis Generic class is type of String and length is  : "+ ((String)(this.container)).length());
        }else if( container instanceof Integer){
            System.out.println("THis Generic class is type of Integer " + this.container);
        }
    }
    public Object getValue(){
        return this.container;
    }
}

public class Generics {
    public static void main(String[] args) {
        box<Integer> b1= new box<>(123);
       int ans= (int) b1.getValue();
        System.out.println(ans);
        box<String> b2 = new box<>("Jeevan");
        String ans2= (String)b2.getValue();
        System.out.println(ans2);
        b2.performSomTask();
        b1.performSomTask();
    }
}
