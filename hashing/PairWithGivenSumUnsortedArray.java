package hashing;

import java.util.HashSet;

public class PairWithGivenSumUnsortedArray {
    public static void main(String[] args) {
        // int[] arr = { 3, 2, 8, 15, -8 };
        // int sum = 17;

        int[] arr = { 8, 3, 2, 5 };
        int sum = 6;

        System.out.println(printUnionWrong(arr, sum));
        System.out.println(printUnion(arr, sum));

    }

    private static boolean printUnion(int[] arr, int sum) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int x : arr) {
            if (hashSet.contains(sum - x))
                return true;
            hashSet.add(x);
        }

        return false;
    }

    /* -------------------------------------------------------------------------- */
    /*
     * Won't work. Ex: [8,3,2,5] and sum = 6. It will insert everything into a
     * hashset and then will traverse the array and when it reaches 3, it will
     * search (6-3) i.e 3 in the hashset and will return true whereas the answer is
     * false.
     */
    /* -------------------------------------------------------------------------- */
    private static boolean printUnionWrong(int[] arr, int sum) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int x : arr)
            hashSet.add(x);

        for (int x : arr) {
            if (hashSet.contains(sum - x))
                return true;
        }

        return false;

    }
}
