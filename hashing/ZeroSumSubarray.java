package hashing;

import java.util.HashSet;

public class ZeroSumSubarray {
    public static void main(String[] args) {

        int[] arr = {4, -3, 2, 1};

        System.out.println(zeroSumPrac(arr));
        System.out.println(zeroSumSubarray(arr));
    }


    private static boolean zeroSumPrac(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        int preSum = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum = preSum + arr[i];

            if (set.contains(preSum))
                return true;

            if (preSum == 0)
                return true;

            set.add(preSum);
        }
        return false;
    }

    private static boolean zeroSumSubarray(int[] arr) {

        HashSet<Integer> hashSet = new HashSet<>();
        int prefix_sum = 0;

        for (int x : arr) {
            prefix_sum += x;

            if (hashSet.contains(prefix_sum))
                return true;

            /* --------- This condition is for when a zero subarray starts with --------- */
            /* --------------------- the first index and not middle --------------------- */
            if (prefix_sum == 0)
                return true;

            hashSet.add(prefix_sum);
        }

        return false;
    }

}
