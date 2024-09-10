package day6;

public class ArrayRotation {
    public static void main(String[] args) {

       int arr[] = {2, 3, 4, 5, 6, 7, 8, 9};
       int d = 3;

       rotateArray(arr, d);

        System.out.println("Output : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void rotateArray(int[] arr, int d){
        int arrayLength = arr.length;

        d %= arrayLength;

        // Create another variable to store the the selected index
        int[] newArrayTemp = new int[arrayLength];

        // Duplicate from index d to the last index of newArrayTemp
        for(int i = 0; i< arrayLength - d; i++){
            newArrayTemp[i] = arr[d + i];
        }

        //
        for(int i = arrayLength - d; i < arrayLength; i++){
            newArrayTemp[i] = arr[i - (arrayLength - d)];
        }

        for(int i = 0; i < arrayLength; i++){
            arr[i] = newArrayTemp[i];
        }

    }
}

//Java Array Program For Array Rotation
//
//Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
//Output:  3 4 5 6 7 1 2
//
//Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
//So, Final result: 3, 4, 5, 6, 7, 1, 2
