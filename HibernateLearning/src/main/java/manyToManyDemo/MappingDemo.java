package manyToManyDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.List;
//print below commit , save above commit.
public class MappingDemo {
    public static void main(String[] args) {
        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Session session= factory.openSession();

        Transaction transaction = session.beginTransaction();




        Employee emp1= new Employee();
        emp1.setId(1);
        emp1.setName("Jeevan");

        Employee emp2 = new Employee();
        emp2.setId(2);
        emp2.setName("Rakesh");

        Project project1= new Project();
        project1.setId(34);
        project1.setName("Java-Project");

        Project project2= new Project();
        project2.setId(35);
        project2.setName("React-Project");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);

        List<Project> projectList= new ArrayList<>();
        projectList.add(project1);
        projectList.add(project2);

        emp1.setProjects(projectList);
        project2.setEmployees(employeeList);

        session.save(emp1);
        session.save(emp2);
        session.save(project1);
        session.save(project2);

        transaction.commit();


          session.close();
          factory.close();

    }
}
