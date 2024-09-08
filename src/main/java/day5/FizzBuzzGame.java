package day5;

import java.util.Scanner;

public class FizzBuzzGame {

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.print("Fizz");
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(i);
            }

            // Add a comma and space for all except the last element
            if (i < n) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of times to loop
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Call the FizzBuzz function
        fizzBuzz(n);

        scanner.close();  // Close the scanner
    }
}
