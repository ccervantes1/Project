
public class Card {

    private String question;
    private String answer;


    public Card(String question, String answer, int interval, boolean isVirgin) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return this.question;
    }


    public String getAnswer() {
        return this.answer;
    }


    public void setQuestion(String question) {
        this.question = question;
    }


    public void setAnswer(String answer) {
        this.answer = answer;
    }

}