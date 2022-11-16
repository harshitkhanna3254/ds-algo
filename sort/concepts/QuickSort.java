package sort.concepts;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {8, 4, 7, 9, 3, 10, 5};

        int[] arr1 = {10, 10, 10, 10, 10, 10, 10};

        // System.out.println(hoare(arr, 0, 6));

        quicksortLomuto(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        quicksortHoare(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));
    }

    static void quicksortLomuto(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = lomuto(arr, low, high);
            quicksortLomuto(arr, low, partitionIndex - 1);
            quicksortLomuto(arr, partitionIndex + 1, high);
        }
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
