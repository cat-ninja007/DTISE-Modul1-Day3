package day6;

public class SortArray {
    public static void main(String[] args) {
        // Test examples
        int[] nums1 = {8, 7, 5, 2};
        String direction1 = "asc";

        int[] nums2 = {8, 7, 5, 2};
        String direction2 = "desc";

        // Sort in ascending order
        sortArray(nums1, direction1);
        System.out.print("Ascending Order: [ ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println("]"); // Output: [ 2, 5, 7, 8 ]

        // Sort in descending order
        sortArray(nums2, direction2);
        System.out.print("Descending Order: [ ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
        System.out.println("]"); // Output: [ 8, 7, 5, 2 ]
    }

    // Method to sort the array in the specified direction
    public static void sortArray(int[] nums, String direction) {
        int n = nums.length;

        // Bubble Sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Ascending order
                if (direction.equals("asc") && nums[j] > nums[j + 1]) {
                    // Swap nums[j] and nums[j + 1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                // Descending order
                else if (direction.equals("desc") && nums[j] < nums[j + 1]) {
                    // Swap nums[j] and nums[j + 1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }


}

