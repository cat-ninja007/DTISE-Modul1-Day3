package day4;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of rows for star pattern: ");
        int inputNumber = scanner.nextInt();

        for(int i=1; i <= inputNumber; i++){
            for(int j=1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }


    }
}
