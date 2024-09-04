package org.example;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramIdentifier {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = readString(scanner);

        System.out.print("Enter the second string: ");
        String str2 = readString(scanner);

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    private static String readString(Scanner scanner) {
        String str = "";
        char ch;
        while ((ch = scanner.next().charAt(0)) != '\n') {
            str += ch;
        }
        return str;
    }

}
