package oneTooneLearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class oneToneDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Question q1= new Question();
        q1.setQuestionID(1);
        q1.setQuestion("What is Java .?");

        Answer answer= new Answer();
        answer.setAnswerID(1234);
        answer.setAnswer("Java is a programming langauage");
        answer.setQuestion(q1);
        q1.setAnswer(answer);

        Question q2= new Question();
        q2.setQuestionID(2);
        q2.setQuestion("What is C++ .?");

        Answer answer1= new Answer();
        answer1.setAnswerID(5678);
        answer1.setAnswer("C++ is a  langauage");
        answer1.setQuestion(q2);
        q2.setAnswer(answer1);

        session.save(q1);
        session.save(q2);
        session.save(answer);
        session.save(answer1);

        tx.commit();
        //fetching...
        Question ques1= (Question) session.get(Question.class,1);
        System.out.println(ques1.getQuestion());
        System.out.println((Answer)ques1.getAnswer());

        session.close();

        factory.close();
    }
}
