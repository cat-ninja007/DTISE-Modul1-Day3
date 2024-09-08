package day5;

import java.util.HashMap;

public class IndicesOfTwoNumSum {
    public static int[] findTwoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their corresponding indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  // Find the complement

            // If the complement exists in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, store the current number and its index in the map
            map.put(nums[i], i);
        }

        // If no pair is found, return null
        return null;
    }

    public static void main(String[] args) {
        // Test case
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Find indices of two numbers that add up to target
        int[] result = findTwoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No pair exists");
        }
    }
}
