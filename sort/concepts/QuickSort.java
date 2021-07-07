package sort.concepts;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = { 8, 4, 7, 9, 3, 10, 5 };

        int[] arr1 = { 20, 5, 40, 60, 10, 30 };

        quicksort(arr, 0, 6);

        System.out.println(Arrays.toString(arr));
    }

    static void quicksort(int[] arr, int low, int high) {

        if (low < high) {
            int partitionIndex = lomuto(arr, low, high);
            quicksort(arr, low, partitionIndex - 1);
            quicksort(arr, partitionIndex + 1, high);
        }
    }

    static int lomuto(int[] arr, int low, int high) {

        int i = low - 1;
        int pivot = arr[high];

        while (low < high) {
            if (arr[low] < pivot) {
                swap(arr, ++i, low);
            }
            low++;
        }

        swap(arr, ++i, high);
        return i;
    }

    static void swap(int[] arr, int x, int y) {

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
