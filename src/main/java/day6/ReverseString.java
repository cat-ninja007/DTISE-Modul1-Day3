package day6;

public class ReverseString {
    public static void main(String[] args) {
        // Test examples
        String input1 = "kucing";
        String input2 = "king kong";

        // Reverse the strings and print the results
        System.out.println("Reversed: " + reverseString(input1));
        System.out.println("Reversed: " + reverseString(input2));
    }


    public static String reverseString(String input) {
        // Convert the input string to a character array
        char[] charArray = input.toCharArray();

        // Initialize two pointers, one at the start and one at the end of the array
        int left = 0;
        int right = charArray.length - 1;

        // Swap characters from the start and end, moving towards the center
        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move pointers towards the center
            left++;
            right--;
        }

        // Convert the character array back to a string and return
        return new String(charArray);
    }
}
