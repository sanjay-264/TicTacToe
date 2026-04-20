package org.example;

public class TicTacToe {

    public static void main(String[] args) {

        // Step 1: Create 2D array
        char[][] board = new char[3][3];

        // Step 2: Initialize board with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Step 3: Print the board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // move to next line
        }
    }
}