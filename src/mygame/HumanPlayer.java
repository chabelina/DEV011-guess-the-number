package mygame;

import java.util.Scanner;

public class HumanPlayer extends Player {
    @Override
    public int makeGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player 1, enter your guess: ");
        int guess = scanner.nextInt();
        scanner.close();
        return guess;
    }
}
