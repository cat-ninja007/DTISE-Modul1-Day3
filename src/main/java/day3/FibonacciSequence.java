package day3;

import java.util.Scanner;


public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("Fibonacci sequence up to " + n + " terms:");
            generateFibonacci(n);
        }
    }

    private static void generateFibonacci(int n) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print(firstTerm + " " + secondTerm);

        for (int i = 2; i < n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
