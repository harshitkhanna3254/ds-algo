package arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 33, 6, 83, 3, 7, 90 };

        int[] arr1 = {1};

        System.out.println(Arrays.toString(reverseIt(arr)));
    }

    static int[] reverseIt(int[] arr) {

        for (int i = 0; i <= (arr.length- 1)/2; i++) {
            int indexFromLast = arr.length - 1 - i;
            int temp = arr[i];
            arr[i] = arr[indexFromLast];
            arr[indexFromLast] = temp;
        }

        return arr;
    }

}
