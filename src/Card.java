
public class Card {

    private String question;
    private String answer;
    private int interval;


    public Card(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return this.question;
    }


    public String getAnswer() {
        return this.answer;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }


    public void setQuestion(String question) {
        this.question = question;
    }


    public void setAnswer(String answer) {
        this.answer = answer;
    }

}