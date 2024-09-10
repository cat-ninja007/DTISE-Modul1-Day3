package day6;

public class DuplicateChecker {

    public static void main(String[] args) {
        // Test examples
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        // Print results
        System.out.println(containsDuplicate(nums1)); // Output: true
        System.out.println(containsDuplicate(nums2)); // Output: false
        System.out.println(containsDuplicate(nums3)); // Output: true
    }

    public static boolean containsDuplicate(int[] nums) {
        // Nested loop to check each element against all others
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // If a duplicate is found, return true
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        // No duplicates found, return false
        return false;
    }


}
