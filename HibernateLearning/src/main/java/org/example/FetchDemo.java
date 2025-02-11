package org.example;

import org.hibernate.Session;
//get learning
public class FetchDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
     //   Student student = (Student) session.get(Student.class, 1);  // typecast require otherwise it shows the reference
        Student student = (Student) session.get(Student.class, 2);  //object not found -> null
      //  Student student = (Student) session.load(Student.class, 6);  //object not found exception.
        System.out.println(student);
        Student student2 = (Student) session.get(Student.class, 2); // 2 time same object call . came from catch memory in session.
        System.out.println(student2);   //

//        if (student != null) {
//            System.out.println(student.getName());
//        } else {
//            System.out.println("Student not found.");
//        }
        session.close();

    }
}
