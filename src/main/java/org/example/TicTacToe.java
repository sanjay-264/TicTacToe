package org.example;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        int slot = getUserInput();

        int row = getRow(slot);
        int col = getCol(slot);

        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }

    // UC3 method
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter slot (1-9): ");
        return scanner.nextInt();
    }

    // UC4 methods
    public static int getRow(int slot) {
        return (slot - 1) / 3;
    }

    public static int getCol(int slot) {
        return (slot - 1) % 3;
    }
}