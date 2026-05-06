public class TicTacToe {

    public static void main(String[] args) {

        char[][] board = {
                {'X', 'X', 'X'},
                {'-', 'O', '-'},
                {'O', '-', 'O'}
        };

        char currentPlayer = 'X';

        if (checkWinner(board, currentPlayer)) {
            System.out.println("Player " + currentPlayer + " Wins!");
        } else {
            System.out.println("No Winner");
        }
    }

    // UC9 Method
    public static boolean checkWinner(char[][] board, char symbol) {

        // Check Rows
        for (int i = 0; i < 3; i++) {

            if (board[i][0] == symbol &&
                    board[i][1] == symbol &&
                    board[i][2] == symbol) {

                return true;
            }
        }

        // Check Columns
        for (int j = 0; j < 3; j++) {

            if (board[0][j] == symbol &&
                    board[1][j] == symbol &&
                    board[2][j] == symbol) {

                return true;
            }
        }

        // Check Main Diagonal
        if (board[0][0] == symbol &&
                board[1][1] == symbol &&
                board[2][2] == symbol) {

            return true;
        }

        // Check Secondary Diagonal
        if (board[0][2] == symbol &&
                board[1][1] == symbol &&
                board[2][0] == symbol) {

            return true;
        }

        return false;
    }
}