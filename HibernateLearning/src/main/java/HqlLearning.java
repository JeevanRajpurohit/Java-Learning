import org.example.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HqlLearning {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        session.beginTransaction();

        // HQL Query
       // String query = "from Student where duration=:'2 months'";
        //or "from Student as s where s.duration=:x ";
        // we can also difine a parameter in query and then setparameter later.
      //  ex . String query = "from Student where duration=x";
        // qyery.setparameter(x : '2 months');
      //  Query queryObject = session.createQuery(query);
        Query q2 = session.createQuery("delete from Student where duration='3 months'");
        int r = q2.executeUpdate();
        System.out.println("Deleted :");
        System.out.println(r);
        // Multiple results -> list
//        List<Student> students = queryObject.list();
//        System.out.println("Total Students Fetched: " + students.size());
//
//        for (Student student : students) {
//            System.out.println(student.getName());
//        }
        //updating
        Query updateQuery = session.createQuery("UPDATE Student SET duration = :newDuration WHERE name = :studentName");
        updateQuery.setParameter("newDuration", "6 months");
        updateQuery.setParameter("studentName", "John Doe");

        int rowsUpdated = updateQuery.executeUpdate();
        System.out.println("Records Updated: " + rowsUpdated);

        //Join query
        Query joinQuery = session.createQuery("SELECT s.name, c.courseName FROM Student s JOIN s.course c WHERE c.courseName = :courseName");
        joinQuery.setParameter("courseName", "Java Programming");

        List<Object[]> result = joinQuery.list();
        for (Object[] row : result) {
            System.out.println("Student: " + row[0] + ", Course: " + row[1]);
        }
        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}
