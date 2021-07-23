package hashing;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {

        // int[] arr = { 1, 3, 9, 2, 8, 2 };

        // 1,3,9,2,8

        int[] arr = { 1, 3, 4, 3, 3, 2, 9, 10 };

        System.out.println(longestConsecutiveSubsequence(arr));

    }

    private static int longestConsecutiveSubsequence(int[] arr) {

        HashSet<Integer> hashset = new HashSet<>();

        for (int x : arr)
            hashset.add(x);

        int res = 1;

        for (int element : hashset) {

            if (!hashset.contains(element - 1)) {
                int count_longest = 1;
                while (hashset.contains(element + count_longest)) {
                    count_longest++;
                    res = Math.max(count_longest, res);
                }
            }
        }

        return res;
    }
}
