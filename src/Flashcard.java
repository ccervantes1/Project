import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;

public class Flashcard {

    private LinkedList<Card> cards = null;
    private Path cardsPath = null;
    private File cardsFile = null;
    private final String FIELD_SEPERATOR = "\t";

    public Flashcard() {
        cardsPath = Paths.get("information.txt"); // default path to save data file
        cardsFile = cardsPath.toFile();
        cards = this.getCards();
    }
    public LinkedList<Card> getCards() {

        if (cards != null) return cards;

        cards = new LinkedList<>();

        if (Files.exists(cardsPath)) {
            try (BufferedReader in =
                         new BufferedReader(
                                 new FileReader(cardsFile))) {
                String line = in.readLine();
                while (line != null) {
                    String[] fields = line.split(FIELD_SEPERATOR);
                    String question = fields[0];
                    String answer = fields[1];
                    Card card = new Card(question, answer);
                    cards.add(card);
                    line = in.readLine();
                }
            }
            catch(IOException e) {
                e.printStackTrace();
                return null;
            }
        }
        return cards;
    }

}
