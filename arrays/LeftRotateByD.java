package arrays;

import java.util.Arrays;

public class LeftRotateByD {
    public static void main(String[] args) {

        int[] arr = { 2, 6, 8, 33, 6, 54, 83, 3, 7, 90 };

        int[] arr1 = { 10, 20, 0, 0, 30, 0, 40, 0, 40, 0 };

        int d = 6;

        System.out.println(Arrays.toString(lRotateByD(arr1, d % arr.length)));

    }

    static int[] lRotateByD(int[] arr, int d) {

        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        return arr;
    }

    static int[] reverse(int[] arr, int low, int high) {

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        return arr;
    }
}
