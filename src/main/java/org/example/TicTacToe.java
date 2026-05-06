public class TicTacToe {

    public static void main(String[] args) {

        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'O', 'O'},
                {'O', 'X', 'X'}
        };

        if (isDraw(board)) {
            System.out.println("Match Draw!");
        } else {
            System.out.println("Game Still Running");
        }
    }

    // UC10 Method
    public static boolean isDraw(char[][] board) {

        // Traverse board
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                // Empty cell found
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }

        // No empty cells
        return true;
    }
}