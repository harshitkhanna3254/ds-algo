package arrays;

import java.util.Arrays;

public class Leaders {
    public static void main(String[] args) {

        int[] arr = { 7, 10, 4, 3, 6, 5, 2 };

        int[] arr1 = { 10, 20, 0, 0, 30, 0, 40, 0, 40, 0 };

        System.out.println(Arrays.toString(leaders(arr)));

    }

    static int[] leaders(int[] arr) {

        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = Math.max(arr[i], max);
                System.out.println(max);
            }
        }

        return arr;
    }
}
