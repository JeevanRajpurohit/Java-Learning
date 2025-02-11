package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;

public class EmbeddableDemo {
    public static void main(String[] args) throws IOException {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();


        Student student2 = new Student();
        student2.setId(12);
        student2.setName("Ramesh");
        student2.setEmail("Ramesh@123");

        Certificate certificate = new Certificate();
        certificate.setCourse("Android");
        certificate.setDuration("3 months");
        student2.setCerti(certificate);

        Student student3 = new Student();
        student3.setId(12);
        student3.setName("Raju");
        student3.setEmail("Raju@123");

        Certificate certificate1 = new Certificate();
        certificate1.setCourse("Microsoft..");
        certificate1.setDuration("2 months");
        student3.setCerti(certificate1);

        //saving object
        session.save(student2);
        session.save(student3);
        tx.commit();
        session.close();

    }
}
