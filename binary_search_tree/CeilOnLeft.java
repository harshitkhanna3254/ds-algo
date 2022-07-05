package binary_search_tree;

import java.util.TreeSet;

public class CeilOnLeft {
    public static void main(String[] args) {
        int[] arr1 = { 2, 8, 30, 15, 25, 12 }; // -1 -1 -1 30 30 15
        int[] arr2 = { 30, 20, 10 }; // -1 30 20
        int[] arr3 = { 10, 20, 30 }; // -1 -1 -1
        int[] arr4 = { 6, 18, 4, 5 }; // -1 -1 6 6

        ceilOnLeftSideNaive(arr1);
        ceilOnLeftSide(arr1);
    }

    static void ceilOnLeftSideNaive(int[] arr) {
        /*
         * O(n^2)
         */
    }

    static void ceilOnLeftSide(int[] arr) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.println();
        for (int x : arr) {
            treeSet.add(x);
            System.out.print(treeSet.higher(x) + " ");
        }
    }
}
