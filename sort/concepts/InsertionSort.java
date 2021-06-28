package sort.concepts;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = { 6, 2, 7, 9, 2, 73, 8, 0, 2, 6, 8, 2, 7, 92, 3, 2 };

        int[] arr1 = { 20, 5, 40, 60, 10, 30 };

        // System.out.println(Arrays.toString(selectionSort(arr)));

        System.out.println(Arrays.toString(insertionSort(arr1)));

    }

    static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        return arr;
    }

    static int[] swap(int[] arr, int x, int y) {

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

        return arr;
    }
}
