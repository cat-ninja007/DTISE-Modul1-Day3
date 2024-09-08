package day5;

import java.util.Random;
import java.util.Scanner;

public class WordGuessingGame {
    // List of possible words for the game
    private static final String[] WORDS = {"java", "python", "kotlin", "javascript", "ruby", "swift"};
    private static final int MAX_ATTEMPTS = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToGuess = selectRandomWord(); // Select a random word
        String hiddenWord = hideWord(wordToGuess); // Hide the word with underscores
        int attemptsLeft = MAX_ATTEMPTS;

        System.out.println("Welcome to the Word Guessing Game!");

        while (attemptsLeft > 0 && hiddenWord.contains("_")) {
            System.out.println("\nWord to guess: " + hiddenWord);
            System.out.println("Attempts left: " + attemptsLeft);
            char guess = getPlayerGuess(scanner);

            if (isGuessCorrect(wordToGuess, guess)) {
                hiddenWord = updateHiddenWord(wordToGuess, hiddenWord, guess);
                System.out.println("Good job! '" + guess + "' is in the word.");
            } else {
                attemptsLeft--;
                System.out.println("Sorry, '" + guess + "' is not in the word.");
            }
        }

        // Display the final result
        displayGameResult(wordToGuess, hiddenWord, attemptsLeft);
        scanner.close();
    }

    // Method 1: Select a random word from the WORDS array
    private static String selectRandomWord() {
        Random random = new Random();
        int index = random.nextInt(WORDS.length);
        return WORDS[index];
    }

    // Method 2: Hide the word by returning underscores for each letter
    private static String hideWord(String word) {
        return "_".repeat(word.length()); // Create underscores with the same length as the word
    }

    // Method 3: Get the player's guess
    private static char getPlayerGuess(Scanner scanner) {
        System.out.print("Enter your guess (a single letter): ");
        return scanner.next().toLowerCase().charAt(0); // Return the first character of input
    }

    // Method 4: Check if the guessed character is in the word
    private static boolean isGuessCorrect(String word, char guess) {
        return word.indexOf(guess) >= 0; // Returns true if the character is found in the word
    }

    // Method 5: Update the hidden word with the correctly guessed character
    private static String updateHiddenWord(String word, String hiddenWord, char guess) {
        StringBuilder updatedHiddenWord = new StringBuilder(hiddenWord);

        // Reveal the guessed character in the hidden word
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                updatedHiddenWord.setCharAt(i, guess); // Replace underscore with guessed letter
            }
        }
        return updatedHiddenWord.toString();
    }

    // Method 6: Display the game result, indicating if the player won or lost
    private static void displayGameResult(String wordToGuess, String hiddenWord, int attemptsLeft) {
        if (hiddenWord.equals(wordToGuess)) {
            System.out.println("\nCongratulations! You guessed the word: " + wordToGuess);
        } else {
            System.out.println("\nGame over! The word was: " + wordToGuess);
        }
    }
}
