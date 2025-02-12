package oneTooneLearning;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
    @Id
  //  @Column(name="Question-ID");
     private int questionID;
     private String question;

     //one 2 one mapping
     @OneToOne
     private Answer answer;

    public Question() {

    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Question(int questionID, String question) {
        this.questionID = questionID;
        this.question = question;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
