public class Flashcard {
    // private data variables
    private String word;
    private String definition;

    // public constructor
    public Flashcard(String newWord, String newDefinition) {
        setWord(newWord);
        setDefinition(newDefinition);
    }

    // getter for word
    public String getWord(){
        return word;
    }

    // getter for definition
    public String getDefinition(){
        return definition;
    }

    // setter for word
    public void setWord(String newWord){
        word = newWord;
    }

    // setter for definition
    public void setDefinition(String newDefinition) {
        definition = newDefinition;
    }

}
