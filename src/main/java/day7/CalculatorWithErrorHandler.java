package day7;

import java.util.Scanner;

public class CalculatorWithErrorHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        boolean validInput = true;

        System.out.println("Enter numbers to calculate average (enter 'q' to finish):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'q' to finish.");
                validInput = false;
            }

            if (validInput) {
                double average = (double) sum / count;
                System.out.println("Average: " + average);
            } else {
                validInput = true;
            }
        }

        scanner.close();
    }
}