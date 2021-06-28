package sort.concepts;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = { 6, 2, 7, 9, 2, 73, 8, 0, 2, 6, 8, 2, 7, 92, 3, 2 };

        System.out.println(Arrays.toString(bSort(arr)));

        System.out.println(Arrays.toString(bSortOptimized(arr)));

    }

    static int[] bSortOptimized(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }

        return arr;
    }

    static int[] bSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
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
