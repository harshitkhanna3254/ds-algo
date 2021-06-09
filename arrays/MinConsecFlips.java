package arrays;

import java.util.Arrays;

public class MinConsecFlips {
    public static void main(String[] args) {

        int[] arr = { 1, 1, 0, 0, 0, 1 };

        int[] arr1 = { 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1 };

        int[] arr2 = { 1, 1, 1 };

        int[] arr3 = { 0, 1 };

        int[] arr4 = { 0, 1, 1, 0, 1, 1, 0 };

        minFlips(arr4);
    }

    static void minFlips(int[] a) {

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                if (a[i] != a[0])
                    System.out.print("From " + i + " to ");
                else
                    System.out.println(i - 1 + "index");
            }
        }

        if (a[a.length - 1] != a[0]) {
            System.out.println(a.length - 1 + " index");
        }

    }
}
