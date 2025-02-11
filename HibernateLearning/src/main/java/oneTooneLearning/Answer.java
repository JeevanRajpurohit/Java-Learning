package oneTooneLearning;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {

    @Id
  //  @Column(name="Answer-ID");
    private int answerID;
    private String answer;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @OneToOne(mappedBy = "answer")     //only one foriegn key will be created.(mapped this foriegin key to answer.

    private Question question;    //we can rename a onetoonefile use JoinColoun(name="cbscjs");


    public int getAnswerID() {
        return answerID;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    @Override
    public String toString() {
        return "Answer{" +
                "answerID=" + answerID +
                ", answer='" + answer + '\'' +
                '}';
    }
}
