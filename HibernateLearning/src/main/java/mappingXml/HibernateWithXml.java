package mappingXml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateWithXml {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        Transaction transaction= session.beginTransaction();

        Person person = new Person(11, "Jeevan","SinduBhavan","8758933385");

        session.save(person);

        transaction.commit();

        factory.close();
        session.close();

    }
}
