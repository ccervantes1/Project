import java.util.LinkedList;
import java.util.Collections;
public class Main {



    public static void main(String[] args) {


        Flashcard io = new Flashcard();
        LinkedList<Card> c = io.getCards();
        for (Card card : c) {
            System.out.println(card.getQuestion());
            System.out.println(card.getAnswer());
        }
        Collections.shuffle(c);
        System.out.println("Results After Randomization");
        for (Card card : c) {
            System.out.println(card.getQuestion());
            System.out.println(card.getAnswer());

        }


    }



}