package sort.concepts;

import java.util.Arrays;

/* -------------------------------------------------------------------------- */
/*                        DUTCH NATIONAL FLAG ALGORITHM                       */
/* -------------------------------------------------------------------------- */

public class SortArrayWithThreeTypes {
    public static void main(String[] args) {

        int[] arr = { 1, 0, 2, 1, 0, 2, 0, 1, 2, 0, 2, 1, 0, 1, 2, 1, 0, 2, 1, 2, 0, 1, 0, 0, 0, 1, 2, 0, 0, 1, 1, 1, 2,
                0, 2, 1, 0, 2, 1, 0, 1, 2, 0, 1, 2, 2, 2, 2, 0, 0, 1, 0, 2 };
        zeroesOnesAndTwos(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = { 2, 1, 0, 1, 2, 0, 1, 1, 2, 1, 2 };
        zeroesOnesAndTwos(arr1);
        System.out.println(Arrays.toString(arr1));

    }

    public static void zeroesOnesAndTwos(int[] arr) {

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    static void swap(int[] arr, int x, int y) {

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
