package arrays;

import java.util.Arrays;

public class Kadane {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 10, 6, 4, 8, 1 };

        int[] arr1 = { 1, -2, 3, -1, 2 };

        System.out.println(maxSubarrayKadane(arr1));
        System.out.println(maxSubarrayNaive(arr1));

    }

    static int maxSubarrayKadane(int[] arr) {

        int res = arr[0];

        int[] endMax = new int[arr.length];
        endMax[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            endMax[i] = Math.max(arr[i], endMax[i - 1] + arr[i]);
            res = Math.max(res, endMax[i]);
        }

        return res;
    }

    static int maxSubarrayNaive(int[] arr) {

        int res = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < arr.length; j++) {
                curr = curr + arr[j];
                res = Math.max(res, curr);
            }
        }

        return res;
    }
}
