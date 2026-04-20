package org.example;

public class TicTacToe {

    public static void main(String[] args) {

        // Sample board (can come from previous UC)
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        // Example input (assume received from UC4)
        int row = 1;
        int col = 1;

        // Validation check
        if (isValidMove(board, row, col)) {
            System.out.println("Move Accepted");
        } else {
            System.out.println("Move Rejected");
        }
    }

    // UC5: Validation Method
    public static boolean isValidMove(char[][] board, int row, int col) {

        // 1. Boundary Check (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // 2. Cell Empty Check
        if (board[row][col] != '-') {
            return false;
        }

        // Valid move
        return true;
    }
}