package hashing;

import java.util.HashSet;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 15, 20, 5, 15 };
        int[] arr2 = { 15, 15, 15, 20, 10 };

        printUnion(arr1, arr2);
    }

    private static void printUnion(int[] arr1, int[] arr2) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int x : arr1)
            hashSet.add(x);
        for (int x : arr2)
            hashSet.add(x);

        System.out.println("Number of distinct elements in union " + hashSet.size());
    }
}
