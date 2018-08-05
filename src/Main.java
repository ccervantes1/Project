import java.util.LinkedList;

public class Flashcards {
    public static void main(String[] args) {

        Flashcards io = new Flashcards();
        LinkedList<Card> c = io.getCards();
        for (Card card : c) {
            System.out.println(card.getQuestion());
            System.out.println(card.getAnswer());
        }