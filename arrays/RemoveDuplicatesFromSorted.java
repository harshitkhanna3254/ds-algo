package arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {

        int[] arr = { 2, 6, 8, 33, 6, 54, 83, 3, 7, 90 };

        int[] arr1 = { 10, 20, 20, 30, 30, 30, 40, 40, 40, 40 };

        System.out.println(Arrays.toString(removeDup(arr1)));

    }

    static int[] removeDup(int[] arr) {

        int[] arr1 = new int[arr.length];

        int index = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr1[index++] = arr[i];
            }
        }

        arr1[index] = arr[arr.length - 1];
        return arr1;
    }

}
