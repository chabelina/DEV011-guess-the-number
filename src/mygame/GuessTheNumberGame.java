package mygame;

import java.util.Random;
public class GuessTheNumberGame {
    private Random random = new Random();
    private int targetNumber;
    public static void main(String[] args)
    {
        GuessTheNumberGame game = new GuessTheNumberGame();
        game.targetNumber = game.random.nextInt(100)+1;
        System.out.println("Welcome to Guess The Number!");
    }
}

