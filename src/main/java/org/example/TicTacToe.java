package org.example;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        // Call method to get user input
        int slot = getUserInput();

        System.out.println("You selected slot: " + slot);
    }

    // Method to read user input
    public static int getUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();

        return slot;
    }
}