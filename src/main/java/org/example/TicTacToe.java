public class TicTacToe {

    public static void main(String[] args) {

        // Create board
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        // Player move details
        int row = 0;
        int col = 1;
        char symbol = 'X';

        // Update board
        updateBoard(board, row, col, symbol);

        // Display updated board
        printBoard(board);
    }

    // UC6 Method
    public static void updateBoard(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Print board
    public static void printBoard(char[][] board) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }
}