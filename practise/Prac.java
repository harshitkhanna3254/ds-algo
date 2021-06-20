package practise;

import java.util.Arrays;

public class Prac {
    public static void main(String[] args) {
        final int num = 250;

        int[] arr = { 7, 4, 1, 2, 6, 9, 7, 5, 8, 3 };

        int[] arr2 = { 2, 3, 10, 6, 4, 8, 1 };

        int[] arr3 = { 20, 20, 20 };

        int[] arr4 = { 3, 4, 8, -9, 20, 6 };

        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 .....

        pracArr(arr4);

    }

    static void pracArr(int[] arr) {

        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        System.out.println(Arrays.toString(prefixSum));

    }

    static void pracArrVoid(int[] arr) {

    }

    static int kadane(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(maxEnding, res);
        }

        return res;
    }

}
