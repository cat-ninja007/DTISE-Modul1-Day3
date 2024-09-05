package day4;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;

        System.out.println("Guess the number between 1 to 100");

        while(guess != randomNumber){
            System.out.print("Enter your number: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("It's too low");
            } else if(guess > randomNumber){
                System.out.println("It's too high");
            } else {
                System.out.println("That's right! You finally win this game after " + attempts + " attempts.");
            }
        }
    }
}
