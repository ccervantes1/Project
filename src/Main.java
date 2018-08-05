import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Flashcard io = new Flashcard();
        LinkedList<Card> c = io.getCards();
        for (Card card : c) {
            System.out.println(card.getQuestion());
            System.out.println(card.getAnswer());
        }
    }
}