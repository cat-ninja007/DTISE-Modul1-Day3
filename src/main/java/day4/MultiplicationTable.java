package day4;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of multiplication table: ");
        int inputNumber = scanner.nextInt();

        for(int i=1; i <= inputNumber; i++){
            for(int j=1; j<= inputNumber; j++){
                System.out.print(i*j);
                if(j < inputNumber){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
