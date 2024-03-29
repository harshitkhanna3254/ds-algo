package hashing;

import java.util.HashSet;

public class GivenSumSubarray {
    public static void main(String[] args) {

        int[] arr = {5, 8, 6, 13, 3, -1};
//        int[] arr = {5, 8, 6, 13, 3, -1};
        int sum = 22;

        System.out.println(givenSumSubarrayPrac(arr, sum));
        System.out.println(givenSumSubarray(arr, sum));

    }

    private static boolean givenSumSubarrayPrac(int[] arr, int sum) {

        HashSet<Integer> set = new HashSet<>();
        int preSum = 0;

        for (int i = 0; i < arr.length; i++) {

            preSum += arr[i];

            if (set.contains(preSum - sum))
                return true;
            if (preSum == sum)
                return true;

            set.add(preSum);
        }
        return false;
    }


    private static boolean givenSumSubarray(int[] arr, int desired_sum) {

        HashSet<Integer> hashSet = new HashSet<>();
        int prefix_sum = 0;

        for (int x : arr) {
            prefix_sum += x;

            if (hashSet.contains(prefix_sum - desired_sum))
                return true;

            /* --------- This condition is for when a zero subarray starts with --------- */
            /* --------------------- the first index and not middle --------------------- */
            if (prefix_sum == desired_sum)
                return true;

            hashSet.add(prefix_sum);
        }

        return false;
    }
}
