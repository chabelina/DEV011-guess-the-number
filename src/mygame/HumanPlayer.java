package mygame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer extends Player {
    @Override
    public int makeGuess() {
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        boolean validInput = false;

        while(!validInput)
        {
            System.out.println("Player 1, enter your guess: ");
            try {
                guess = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.print("The input value is not an integer!");
                scanner.next();
            }
        }

        return guess;
    }
}
