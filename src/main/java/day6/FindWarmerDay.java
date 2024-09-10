package day6;

public class FindWarmerDay {
    public static void main(String[] args) {
        // Test examples
        int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] temperatures2 = {30, 40, 50, 60};
        int[] temperatures3 = {30, 60, 90};

        System.out.print("Input: [ ");
        for (int temp : temperatures1) {
            System.out.print(temp + " ");
        }
        System.out.println("]");

        System.out.print("Input: [ ");
        for (int temp : temperatures2) {
            System.out.print(temp + " ");
        }
        System.out.println("]");

        System.out.print("Input: [ ");
        for (int temp : temperatures3) {
            System.out.print(temp + " ");
        }
        System.out.println("]");

        // Find the number of days to wait for a warmer temperature
        int[] result1 = dailyTemperatures(temperatures1);
        int[] result2 = dailyTemperatures(temperatures2);
        int[] result3 = dailyTemperatures(temperatures3);

        // Print results
        System.out.print("Output: ");
        printArray(result1);
        System.out.print("Output: ");
        printArray(result2); // Output: [1, 1, 1, 0]
        System.out.print("Output: ");
        printArray(result3); // Output: [1, 1, 0]
    }

    // Method to find the number of days to wait for a warmer temperature
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        int[] stack = new int[n]; // Stack to store indices
        int top = -1; // Stack top index

        // Iterate through each day
        for (int i = 0; i < n; i++) {
            // While the stack is not empty and the current temperature is greater than the temperature at the index on top of the stack
            while (top >= 0 && temperatures[i] > temperatures[stack[top]]) {
                int index = stack[top--]; // Pop the index from the stack
                result[index] = i - index; // Calculate the number of days to wait
            }
            // Push the current index onto the stack
            stack[++top] = i;
        }

        // No need to process remaining elements in the stack because result is already initialized with 0

        return result;
    }

    // Method to print an array manually
    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}
