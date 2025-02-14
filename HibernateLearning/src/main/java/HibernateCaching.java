import org.example.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCaching {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        Student student = session.get(Student.class,4);
        System.out.println(student.getName());

        System.out.println("Learning first level cache, for below object it will not execute again query.");

        Student student1= session.get(Student.class, 4);
        System.out.println(student1.getName());
    }
}
