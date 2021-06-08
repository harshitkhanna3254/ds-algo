package arrays;

import java.util.Arrays;

public class TrappingRainwater {
    public static void main(String[] args) {

        int[] arr = { 3, 0, 1, 2, 5 };

        int[] arr3 = { 1, 5, 3, 1, 2, 8 };

        int res = -1;

        res = rainwaterNaive(arr);
        System.out.println(res);
        res = rainwaterEff(arr);

    }

    static int rainwaterEff(int[] arr) {

        int collected = 0;
        int n = arr.length;

        int[] lmax = new int[n];
        lmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(arr[i], lmax[i - 1]);
        }

        int[] rmax = new int[n];
        rmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(arr[i], rmax[i + 1]);
        }

        for (int i = 0; i < arr.length; i++) {
            collected += Math.min(lmax[i], rmax[i]) - arr[i];
        }

        return collected;
    }

    static int rainwaterNaive(int[] arr) {

        int collected = 0;

        for (int i = 1; i < arr.length; i++) {
            int lmax = arr[i];
            for (int j = 0; j < i; j++) {
                lmax = Math.max(lmax, arr[j]);
            }

            int rmax = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                rmax = Math.max(rmax, arr[j]);
            }

            collected += Math.min(lmax, rmax) - arr[i];
        }

        return collected;
    }

}
