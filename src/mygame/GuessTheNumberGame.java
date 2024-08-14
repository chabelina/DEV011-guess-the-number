package mygame;

import java.util.Random;
public class GuessTheNumberGame {
    private static Random random = new Random();
    private static int targetNumber;
    public static void main(String[] args)
    {
        targetNumber = random.nextInt(100)+1;
        System.out.println("Cheat: " + targetNumber);
        System.out.println("Welcome to Guess The Number!");

        Player player1 = new HumanPlayer();
        boolean isCorrect = false;

        while(!isCorrect)
        {
            isCorrect = checkGuess(player1);
            if(isCorrect)
            {
                System.out.println("Congrats! You guessed the number.");
            } else {
                int length = player1.guesses.size();
                int latestGuess = player1.guesses.get(length - 1);
                if (latestGuess < targetNumber){
                    System.out.println("Too low!");
                } else System.out.println("Too high!");
                System.out.println("Try again.");
            }
        }
    }

    private static boolean checkGuess(Player player)
    {
        int guess = player.makeGuess();
        player.guesses.add(guess);
        return guess == targetNumber;
    }
}

