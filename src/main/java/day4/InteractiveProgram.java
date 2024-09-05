package day4;

import java.util.Scanner;

public class InteractiveProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;

        do {
            System.out.println("Welcome to my program");
            System.out.print("Press 1 to continue, 2 to stop:");
            inputNumber = scanner.nextInt();
        } while (inputNumber == 1);

        System.out.println("Thank you so much! Good bye..");
    }
}
