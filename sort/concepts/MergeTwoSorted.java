package sort.concepts;

import java.util.Arrays;

public class MergeTwoSorted {
    public static void main(String[] args) {

        int[] arr = { 6, 2, 7, 9, 2, 73, 8, 0, 2, 6, 8, 2, 7, 92, 3, 2 };

        int[] arr1 = { 10, 15, 20 };
        int[] arr2 = { 5, 6, 6, 15 };

        // System.out.println(Arrays.toString(selectionSort(arr)));

        System.out.println(Arrays.toString(merge(arr1, arr2)));

    }

    static int[] merge(int[] arr1, int[] arr2) {

        int[] arr = new int[arr1.length + arr2.length];

        int i1 = 0;
        int i2 = 0;

        int index = 0;
        while (i1 < arr1.length && i2 < arr2.length) {
            if (arr2[i2] <= arr1[i1]) {
                arr[index] = arr2[i2];
                i2++;
            } else {
                arr[index] = arr1[i1];
                i1++;
            }
            index++;
        }

        while (i1 < arr1.length) {
            arr[index] = arr1[i1];
            i1++;
            index++;
        }

        while (i2 < arr2.length) {
            arr[index] = arr2[i2];
            i2++;
            index++;
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
