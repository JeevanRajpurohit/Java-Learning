import java.lang.management.MonitorInfo;

import java.util.*;
class Student{
    String name;
    int marks;
}
class Mobile{
    String brand;
    int price;
    static  String name;
    public Mobile(){
        brand="";
        price=200;
        System.out.println("IS a Constructor");

    }
    static{
        name="Bhavesh";
        System.out.println("is a STatic block");
    }
    public void show(){
        System.out.println(brand +" : "+ price +" : "+name);
    }
    public static void show1(Mobile Obj){
        System.out.print(Obj.brand +" : "+ Obj.price +" : "+name);
    }
}
public class FourthClass {
    public static void main(String[] args) throws ClassNotFoundException {
       int arr[][] = new int[3][];
       arr[0]= new int[3];
       arr[1]= new int[4];
       arr[2]= new int[5];
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               arr[i][j]= (int)(Math.random()*10);
//System.out.print(arr[i][j]+ " ");
           }
          // System.out.println();
       }
       for(int a[] : arr){
           for(int b : a){
               System.out.print(b+" ");
//System.out.print(arr[i][j]+ " ");
            }
             System.out.println();
        }

        Student s1 = new Student();
        s1.name="Jeevan";
        s1.marks=99;
        Student s2= new Student();
        s2.name="Rakesh";
        s2.marks=100;

        Student students[]= new Student[2];
        students[0]=s1;
        students[1]=s2;
        for(Student studs : students){
            System.out.println(studs.name +" : "+ studs.marks);
        }
      StringBuffer sb = new StringBuffer("Jeevan");
      sb.append(" Rajpurohit");
      //String str= sb.toString();
        sb.deleteCharAt(1);
        sb.insert(0, "Java Developer");
      System.out.print(sb);


        Mobile m1= new Mobile();
        m1.brand="Apple";
        m1.price=1000;
        m1.name="SmartPhone";

        Mobile m2= new Mobile();
        m2.brand="Samsung";
        m2.price=2000;
        m2.name="SmartPhone";
     //   m1.name="Phone";  // change in m1 also reflect in m2. bcz of static keyword
        m1.show();
        m2.show();
        Mobile.show1(m1);
        Class.forName("Mobile");








    }
}
