package sort.concepts;

import java.util.Arrays;

public class SortArrayWithTwoTypes {
    public static void main(String[] args) {

        int[] arr = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1 };
        zeroesAndOnes(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = { 21, 4, 6, 3, 8, 3, 5643, 765, 35, 78, 3, 5, 836, 367, 86, 233, 643, 23, 68, 26, 2367, 547, 46,
                465, 235, 68, 97, 13, 35 };
        evenAndOdd(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void evenAndOdd(int[] arr) {

        int i = -1;
        int j = arr.length;

        while (true) {
            do {
                i++;
            } while (arr[i] % 2 == 0);

            do {
                j--;
            } while (arr[j] % 2 == 1);

            if (i >= j)
                return;

            swap(arr, i, j);
        }

    }

    public static void zeroesAndOnes(int[] arr) {

        int i = -1;
        int j = arr.length;

        while (true) {
            do {
                i++;
            } while (arr[i] == 0);

            do {
                j--;
            } while (arr[j] == 1);

            if (i >= j)
                return;

            swap(arr, i, j);
        }
    }

    static void swap(int[] arr, int x, int y) {

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
