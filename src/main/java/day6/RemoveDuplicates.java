package day6;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Test example
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 5};

        // Remove duplicates and print the result
        int[] uniqueNums = removeDuplicates(nums);
        // Print result
        System.out.print("[ ");
        for (int num : uniqueNums) {
            System.out.print(num + " ");
        }
        System.out.print("]");
    }

    // A method to sort the array manually using Bubble Sort
    public static void sortArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap nums[j] and nums[j + 1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    // A method to remove duplicates without using utility classes
    public static int[] removeDuplicates(int[] nums) {
        // First, sort the array manually
        sortArray(nums);

        // Edge case: if the array is empty, return an empty array
        if (nums.length == 0) {
            return new int[0];
        }

        // Count unique elements
        int uniqueCount = 1; // Start from 1
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                uniqueCount++;
            }
        }

        // Create an array to store unique elements
        int[] uniqueNums = new int[uniqueCount];
        uniqueNums[0] = nums[0];
        int uniqueIndex = 1;

        // Populate the unique array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                uniqueNums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueNums;
    }
}
