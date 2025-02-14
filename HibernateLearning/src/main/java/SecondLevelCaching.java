
import org.example.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SecondLevelCaching {
    public static void main(String[] args) {


        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session1 = factory.openSession();

        Student student = session1.get(Student.class,4);
        System.out.println(student.getName());
        session1.close();


        Session session2 = factory.openSession();
        Student student2 = session2.get(Student.class,4);
        System.out.println(student2.getName());
        session2.close();

       factory.close();

    }
}
