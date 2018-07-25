import java.util.*;

public class Deck {
    private List<Flashcard> deckList;

    public Deck() {
        this.deckList = new ArrayList<>();
    }

    public void addCard(Flashcard fc) {
        this.deckList.add(fc);
    }

    public List<?> getDeck() {
        return this.deckList;
    }

    public Flashcard getCard(int i) {
        return this.deckList.get(i);
    }

    public List<?> shuffle() {
        ArrayList<Flashcard> shuffledDeck = new ArrayList<Flashcard>(this.deckList);
        Collections.shuffle(shuffledDeck, new Random((long) Math.random()));
        return shuffledDeck;
    }
}