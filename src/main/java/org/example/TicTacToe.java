package org.example;

import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {

        // Step 1: Create Random object
        Random random = new Random();

        // Step 2: Generate random number (0 or 1)
        int toss = random.nextInt(2);

        String player1 = "Player 1";
        String player2 = "Player 2";

        char player1Symbol;
        char player2Symbol;
        String currentPlayer;
        char currentSymbol;

        // Step 3: Decide who starts
        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = player1;
            currentSymbol = player1Symbol;
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = player2;
            currentSymbol = player2Symbol;
        }

        // Step 4: Print result
        System.out.println("Toss Result: " + toss);
        System.out.println(player1 + " Symbol: " + player1Symbol);
        System.out.println(player2 + " Symbol: " + player2Symbol);
        System.out.println("Starting Player: " + currentPlayer);
        System.out.println("Starting Symbol: " + currentSymbol);
    }
}