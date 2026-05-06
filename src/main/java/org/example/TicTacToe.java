import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static char[][] board=new char[3][3];
    static char player1Symbol,player2Symbol,currentPlayerSymbol;
    static int currentPlayer;

    public static void main(String[] args){
        initializeBoard();
        printBoard();
        tossAndAssignSymbols();
        System.out.println("Player "+currentPlayer+" starts with "+currentPlayerSymbol);

        int[] compPos=getComputerMove();
        placeMove(compPos[0],compPos[1],currentPlayerSymbol);
        printBoard();
    }

    static void initializeBoard(){
        for(int row=0;row<3;row++)
            for(int col=0;col<3;col++)
                board[row][col]='-';
    }

    static void printBoard(){
        System.out.println("------");
        for(int row=0;row<3;row++){
            System.out.print("| ");
            for(int col=0;col<3;col++) System.out.print(board[row][col]+" | ");
            System.out.println();
            System.out.println("------");
        }
    }

    static void tossAndAssignSymbols(){
        int toss=new Random().nextInt(2);
        if(toss==0){
            currentPlayer=1; player1Symbol='X'; player2Symbol='O'; currentPlayerSymbol=player1Symbol;
        }else{
            currentPlayer=2; player2Symbol='X'; player1Symbol='O'; currentPlayerSymbol=player2Symbol;
        }
    }

    static int getUserSlotInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter slot (1-9): ");
        return sc.nextInt();
    }

    static int[] convertSlotToIndex(int slot){
        int index=slot-1;
        return new int[]{index/3,index%3};
    }

    static boolean isValidMove(int row,int col){
        if(row<0||row>2||col<0||col>2) return false;
        return board[row][col]=='-';
    }

    static void placeMove(int row,int col,char symbol){
        board[row][col]=symbol;
    }

    static int[] getComputerMove(){
        Random r=new Random();
        while(true){
            int slot=r.nextInt(9)+1;
            int[] pos=convertSlotToIndex(slot);
            if(isValidMove(pos[0],pos[1])) return pos;
        }
    }
}