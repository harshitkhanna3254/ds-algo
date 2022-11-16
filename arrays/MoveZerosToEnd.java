package arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int[] arr = { 2, 6, 8, 33, 6, 54, 83, 3, 7, 90 };

        int[] arr1 = { 10, 20, 0, 0, 30, 0, 40, 0, 40, 0 };

        System.out.println(Arrays.toString(moveZerosPrac(arr1)));


        System.out.println(Arrays.toString(moveZeros(arr1)));

    }


    private static int[] moveZerosPrac(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while(low < high) {
            if(arr[low] == 0) {
                Reverse.swap(arr, low, high);
                high--;
            } else {
                low++;
            }
        }

        return arr;
    }

    static int[] moveZeros(int[] arr) {

        int zeroIndex = 0;

        // int[] arr1 = { 10, 20, 0, 0, 30, 0, 40, 0, 40, 0 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[zeroIndex];
                arr[zeroIndex] = temp;
                zeroIndex++;
            }
        }

        return arr;
    }
}
