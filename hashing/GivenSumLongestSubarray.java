package hashing;

import java.util.HashMap;

public class GivenSumLongestSubarray {
    public static void main(String[] args) {

        // int[] arr = { 5, 8, -4, -4, 9, -2, -2 };
        // int sum = 0;

        // int[] arr = { 3, 1, 0, 1, 8, 2, 3, 6 };
        // int sum = 5;

        int[] arr = { 8, 3, 1, 5, -6, 6, 2, 2 };
        int sum = 4;

        // [8,11,12,17,11,17,19,21]

        System.out.println(givenSumLongestSubarray(arr, sum));

    }

    private static int givenSumLongestSubarray(int[] arr, int desired_sum) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int res = 0;

        int prefix_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix_sum += arr[i];

            if (hashMap.containsKey(prefix_sum - desired_sum))
                res = Math.max(res, i - hashMap.get(prefix_sum - desired_sum));
            else if (prefix_sum == desired_sum)
                res = i + 1;
            else if (!hashMap.containsKey(prefix_sum))
                hashMap.put(prefix_sum, i);
        }
        // System.out.println(hashMap.toString());

        return res;
    }
}
