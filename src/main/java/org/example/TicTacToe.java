import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        Scanner scanner = new Scanner(System.in);

        char currentPlayer = 'X';
        boolean gameOver = false;
        int moves = 0;

        // UC8 Game Loop
        while (!gameOver) {

            printBoard(board);

            System.out.println("Player " + currentPlayer + " Turn");

            // User input
            int slot = scanner.nextInt();

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            // Validate move
            if (row >= 0 && row < 3 &&
                    col >= 0 && col < 3 &&
                    board[row][col] == '-') {

                // Place move
                board[row][col] = currentPlayer;

                moves++;

                // Check Win
                if (checkWin(board, currentPlayer)) {

                    printBoard(board);

                    System.out.println("Player " + currentPlayer + " Wins!");

                    gameOver = true;
                }

                // Check Draw
                else if (moves == 9) {

                    printBoard(board);

                    System.out.println("Match Draw!");

                    gameOver = true;
                }

                // Switch Turn
                else {

                    if (currentPlayer == 'X') {
                        currentPlayer = 'O';
                    } else {
                        currentPlayer = 'X';
                    }
                }

            } else {
                System.out.println("Invalid Move!");
            }
        }
    }

    // Check Win
    public static boolean checkWin(char[][] board, char symbol) {

        // Rows
        for (int i = 0; i < 3; i++) {

            if (board[i][0] == symbol &&
                    board[i][1] == symbol &&
                    board[i][2] == symbol) {

                return true;
            }
        }

        // Columns
        for (int j = 0; j < 3; j++) {

            if (board[0][j] == symbol &&
                    board[1][j] == symbol &&
                    board[2][j] == symbol) {

                return true;
            }
        }

        // Diagonals
        if (board[0][0] == symbol &&
                board[1][1] == symbol &&
                board[2][2] == symbol) {

            return true;
        }

        if (board[0][2] == symbol &&
                board[1][1] == symbol &&
                board[2][0] == symbol) {

            return true;
        }

        return false;
    }

    // Print Board
    public static void printBoard(char[][] board) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }
}