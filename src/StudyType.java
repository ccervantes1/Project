import java.util.LinkedList;

public class Study {
    private Flashcard input1;
    private LinkedList<Card> cardDeck;
    private int time;
    private int goal;

    private static final int EASY = 20;
    private static final int MODERATE = 10;
    private static final int DIFFICULT= 5;
    public Study() {
        input1 = new Flashcard();
        cardDeck = input1.getCards();
        time = 0;
        goal = -1; // set negative to indicate the end of each play
    }

    public void setEasy() {
        Card card = cardDeck.removeFirst();
        card.setInterval(EASY);
        cardDeck.add(EASY, card);
    }

    public void setModerate() {
        Card card = cardDeck.removeFirst();
        card.setInterval(MODERATE);
        cardDeck.add(MODERATE, card);
    }

    public void setDifficult() {
        Card card = cardDeck.removeFirst();
        card.setInterval(DIFFICULT);
        cardDeck.add(DIFFICULT, card);
    }

    public Card getNextCard() {
        return cardDeck.getFirst();
    }

    public int getTime() {
        return time;
    }
}
