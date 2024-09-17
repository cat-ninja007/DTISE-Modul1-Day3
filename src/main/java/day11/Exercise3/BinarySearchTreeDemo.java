package day11.Exercise3;

// BinarySearchTreeDemo.java
import java.util.Scanner;

public class BinarySearchTreeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        // Prompt the user for the number of elements to insert
        System.out.print("Enter the number of elements to insert into the BST: ");
        int N = scanner.nextInt();

        // Insert N numbers into the binary search tree
        System.out.println("Enter " + N + " numbers to insert into the BST:");
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            bst.insert(number);
            System.out.println(number + " inserted.");
        }

        // Continuous search loop
        while (true) {
            // Prompt the user for the number to search
            System.out.print("Enter a number to search (or type 'exit' to quit): ");
            String input = scanner.next();

            // Check if the user wants to exit
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }

            // Convert the input to an integer and search in the BST
            try {
                int searchNumber = Integer.parseInt(input);
                boolean found = bst.search(searchNumber);

                if (found) {
                    System.out.println(searchNumber + " found in the BST.");
                } else {
                    System.out.println(searchNumber + " not found in the BST.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'exit' to quit.");
            }
        }

        scanner.close();  // Close the scanner
    }
}
