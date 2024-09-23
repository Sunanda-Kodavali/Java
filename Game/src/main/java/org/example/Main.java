package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Let's start with a very simple version of a turn based text adventure
        System.out.println("Welcome to the Text Adventure!");

        // We need an input scanner

        // Then we start a loop
        // Read from  input
        // execute some command
        // quit the loop when "quit" was entered or then the game is over

        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;

        while (gameRunning) {
            String input = scanner.nextLine();

            switch (input) {
                case "quit":
                    gameRunning = false;
                    break;
                case null, default:
                    System.out.println("Invalid input");
            }
        }
        System.out.println("Goodbye!");

    }
}