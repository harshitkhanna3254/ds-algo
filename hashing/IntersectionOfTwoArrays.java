package hashing;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 10, 30, 20 };
        int[] arr2 = { 20, 10, 10, 40 };

        printIntersectionNaive(arr1, arr2);

        Integer[] array1 = Arrays.stream(arr1).boxed().toArray(Integer[]::new);
        Integer[] array2 = Arrays.stream(arr2).boxed().toArray(Integer[]::new);
        printIntersectionEfficient(array1, array2);

    }

    private static void printIntersectionEfficient(Integer[] arr1, Integer[] arr2) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(arr1));

        int res = 0;
        for (int x : arr2) {
            if (hashSet.contains(x)) {
                res++;
                hashSet.remove(x);
            }
        }

        System.out.println(res);
    }

    private static void printIntersectionNaive(int[] arr1, int[] arr2) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        for (int x : arr1)
            hashSet1.add(x);

        for (int x : arr2)
            hashSet2.add(x);

        int res = 0;
        for (int x : hashSet1) {
            if (hashSet2.contains(x))
                res++;
        }

        System.out.println(res);
    }
}
