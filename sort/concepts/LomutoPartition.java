package sort.concepts;

import java.util.Arrays;

public class LomutoPartition {
    public static void main(String[] args) {
        int[] arr = { 10, 80, 30, 90, 40, 50, 70 };

        System.out.println(Arrays.toString(lomuto(arr)));

    }

    static int[] lomuto(int[] arr) {

        int length = arr.length;

        if (length == 1)
            return arr;

        int i = -1;
        int pivot = length - 1;
        for (int l = 0; l < length - 1; l++) {
            if (arr[l] < arr[pivot]) {
                swap(arr, ++i, l);
            }
        }

        swap(arr, ++i, pivot);

        return arr;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
