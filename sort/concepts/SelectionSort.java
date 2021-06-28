package sort.concepts;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = { 6, 2, 7, 9, 2, 73, 8, 0, 2, 6, 8, 2, 7, 92, 3, 2 };

        int[] arr1 = { 10, 5, 8, 20, 2, 18 };

        // System.out.println(Arrays.toString(selectionSort(arr)));

        System.out.println(Arrays.toString(selectionSort(arr1)));

    }

    static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int min_ele_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_ele_index])
                    min_ele_index = j;
            }
            swap(arr, i, min_ele_index);
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
