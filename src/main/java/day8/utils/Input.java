package day8.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    // Method to get an integer input with error handling
    public static int getInt(String message) {
        int result = -1;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(message);
                result = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        return result;
    }

    // Method to get a string input
    public static String getString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}

