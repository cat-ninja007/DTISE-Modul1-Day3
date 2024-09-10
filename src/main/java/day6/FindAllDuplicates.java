package day6;

public class FindAllDuplicates {
    public static void main(String[] args) {
        // Test examples
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums2 = {1, 1, 2};
        int[] nums3 = {1};

        // Find duplicates
        int[] result1 = findDuplicates(nums1);
        int[] result2 = findDuplicates(nums2);
        int[] result3 = findDuplicates(nums3);

        // Print results
        System.out.print("Duplicates: ");
        printArray(result1);
        System.out.print("Duplicates: ");
        printArray(result2);
        System.out.print("Duplicates: ");
        printArray(result3);
    }

    // Method to find all duplicates in the array
    public static int[] findDuplicates(int[] nums) {
        // Temporary array to hold duplicates
        int[] tempDuplicates = new int[nums.length];
        int duplicateCount = 0;

        // Iterate through the array to find duplicates
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // If a duplicate is found
                if (nums[i] == nums[j]) {
                    // Check if this duplicate is already added to the result
                    boolean alreadyAdded = false;
                    for (int k = 0; k < duplicateCount; k++) {
                        if (tempDuplicates[k] == nums[i]) {
                            alreadyAdded = true;
                            break;
                        }
                    }
                    // If not already added, add to tempDuplicates
                    if (!alreadyAdded) {
                        tempDuplicates[duplicateCount++] = nums[i];
                    }
                }
            }
        }

        // Create an array of the exact size for duplicates
        int[] result = new int[duplicateCount];
        for (int i = 0; i < duplicateCount; i++) {
            result[i] = tempDuplicates[i];
        }

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
