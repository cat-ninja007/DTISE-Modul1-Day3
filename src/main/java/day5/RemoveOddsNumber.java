package day5;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveOddsNumber {
    public static ArrayList<Integer> removeOdds(int[] arr) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers as a comma-separated string
        System.out.print("Enter numbers separated by commas: ");
        String input = scanner.nextLine();

        // Split the input string by commas and convert to an integer array
        String[] inputArr = input.split(",");
        int[] arr = new int[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i].trim());  // Convert and trim spaces
        }

        // Remove odd numbers and display the result
        ArrayList<Integer> result = removeOdds(arr);
        System.out.println("Even numbers: " + result);

        scanner.close();  // Close the scanner
    }
}
