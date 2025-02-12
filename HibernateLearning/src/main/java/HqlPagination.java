import org.example.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class HqlPagination {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Query q = session.createQuery("from Student");
        //Pagination
        q.setFirstResult(0);
        q.setMaxResults(2);

        List<Student> students  = q.list();
        for(Student student : students){
            System.out.println("Id for student : " + student.getId() + " Name of student : "+ student.getName());
        }

    }
}
