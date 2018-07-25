public class Flashcard {

    private String word;
    private String definition;


    public Flashcard(String newWord, String newDefinition) {
        setWord(newWord);
        setDefinition(newDefinition);
    }

    public String getWord(){
        return word;
    }

    public String getDefinition(){
        return definition;
    }

    public void setWord(String newWord){
        word = newWord;
    }

    public void setDefinition(String newDefinition) {
        definition = newDefinition;
    }

}
