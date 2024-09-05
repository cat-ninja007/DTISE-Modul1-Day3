package day3;

import java.util.Scanner;

public class CountingVowel {
    public static int countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int vowelCount = countVowels(inputString);
        System.out.println("Number of vowels: " + vowelCount);
    }
}
