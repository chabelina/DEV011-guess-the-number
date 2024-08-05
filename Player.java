import java.util.ArrayList;

abstract public class Player {
    private String name;
    protected ArrayList<Integer> guesses;

    public abstract int makeGuess();

    public String getName() {
        return name;
    }
    
    public ArrayList<Integer> getGuesses() {
        return guesses;
    }
}
