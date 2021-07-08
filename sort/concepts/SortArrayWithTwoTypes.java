package sort.concepts;

import java.util.Arrays;

public class SortArrayWithTwoTypes {
    public static void main(String[] args) {

        int[] arr = { 8, 4, 7, 9, 3, 10, 5 };

        int[] arr1 = { 20, 5, 40, 60, 10, 30 };

        quicksortHoare(arr, 0, 6);
        System.out.println(Arrays.toString(arr));

        quicksortHoare(arr1, 0, 5);
        System.out.println(Arrays.toString(arr1));
    }

    static void quicksortHoare(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = hoare(arr, low, high);
            quicksortHoare(arr, low, partitionIndex);
            quicksortHoare(arr, partitionIndex + 1, high);
        }
    }

    static int hoare(int[] arr, int low, int high) {

        int pivot = arr[low];

        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j)
                return j;

            swap(arr, i, j);
        }
    }

    static void swap(int[] arr, int x, int y) {

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
