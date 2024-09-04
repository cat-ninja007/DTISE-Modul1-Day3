package org.example;

public class SecondSmallestElement {
    public static int findSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int smallest = arr[0];
        int secondSmallest = arr[1];

        if (smallest > secondSmallest) {
            int temp = smallest;
            smallest = secondSmallest;
            secondSmallest = temp;
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2, 9};
        int secondSmallest = findSecondSmallest(numbers);
        System.out.println("The second smallest element is: " + secondSmallest);
    }
}
