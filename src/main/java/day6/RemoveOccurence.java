package day6;

import java.util.Scanner;

public class RemoveOccurence {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 1, 3, 5, 1};
        System.out.print("Initial Array : [ ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("]"); // Output the final result

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number to remove
        System.out.print("Enter the number you want to remove from the array: ");
        int key = scanner.nextInt();

        // Remove all occurrences of the key
        int[] result = removeElement(array, key);

        // Print the result
        System.out.print("Array after removing " + key + ": [ ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println("]"); // Output the final result

    }

    // Method to remove all occurrences of a specified key from the array
    public static int[] removeElement(int[] nums, int key) {
        // Count the number of elements not equal to the key
        int count = 0;
        for (int num : nums) {
            if (num != key) {
                count++;
            }
        }

        // Create a new array of the appropriate size
        int[] result = new int[count];
        int index = 0;

        // Copy elements that are not equal to the key
        for (int num : nums) {
            if (num != key) {
                result[index++] = num;
            }
        }

        return result;
    }
}
