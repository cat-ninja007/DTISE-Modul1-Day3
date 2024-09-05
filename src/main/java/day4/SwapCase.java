package day4;

import java.util.Scanner;

public class SwapCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phrase or sentence: ");
        String input = scanner.nextLine();

        String result = swapCase(input);

        System.out.println("Result: " + result);
    }

    public static String swapCase(String str){
        char[] characterArray = str.toCharArray();
        String result = "";

        for(int i=0; i < characterArray.length; i++){
            char character = characterArray[i];

            if(character >= 'A' && character <= 'Z'){
                character = (char) (character + 32);
            } else if(character >= 'a' && character <= 'z'){
                character = (char) (character - 32);
            }
            result += character;
        }
        return result;
    }


}


//For uppercase letters (A-Z), their ASCII values range from 65 ('A') to 90 ('Z').
//For lowercase letters (a-z), their ASCII values range from 97 ('a') to 122 ('z').
//To convert from uppercase to lowercase, you add 32 to the ASCII value.
//To convert from lowercase to uppercase, you subtract 32 from the ASCII value.
