package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args)throws SQLException {
        // Get Session
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            // Start Transaction
            transaction = session.beginTransaction();
            //Reading from a file
            FileInputStream fs = new FileInputStream("src/main/java/org/example/images.png");
            byte[] data = new byte[fs.available()];
            fs.read(data);
            fs.close();
            System.out.println("File read successfully!");

            // Create Student Object
            Student student = new Student("Jeevan", "Jeevan.rajpurohit@coachbar.io", "data".getBytes());  // // Convert String to byte array .getBytes()

            // Save Student
            session.save(student);

            // Commit Transaction
            transaction.commit();
            System.out.println("Student saved successfully!");

        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
