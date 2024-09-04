package org.example;

import java.util.Scanner;

public class ReverseStringApp {
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);

    }
}
