package practise;

import java.util.Arrays;

public class Prac {
    public static void main(String[] args) {

        // int[] arr = { 7, 4, 1, 2, 6, 9, 7, 5, 8, 3 };

        int[] arr = { 10, 5, 30, 15, 7 };

        int l = 0;
        int r = arr.length - 1;
        mergeSort(arr, l, r);
        System.out.println(Arrays.toString(arr));

    }

    static void mergeSort(int[] arr, int l, int r) {

        if (r > l) {
            int mid = l + (r - l) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }

    }

    static void merge(int[] arr, int l, int m, int r) {

        int length1 = m - l + 1;
        int[] arr1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            arr1[i] = arr[l + i];
        }

        int length2 = r - m;
        int[] arr2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            arr2[i] = arr[m + i + 1];
        }

        int i = 0;
        int j = 0;
        int mainIndex = l;
        while (i < length1 && j < length2) {
            if (arr1[i] <= arr2[j]) {
                arr[mainIndex] = arr1[i];
                i++;
            } else {
                arr[mainIndex] = arr2[j];
                j++;
            }
            mainIndex++;
        }

        while (i < length1) {
            arr[mainIndex] = arr1[i];
            i++;
            mainIndex++;
        }
        while (j < length2) {
            arr[mainIndex] = arr2[j];
            j++;
            mainIndex++;
        }
    }

}