package arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 33, 6, 83, 3, 7, 90, 5 };

        int[] arr1 = {1};

//        System.out.println(Arrays.toString(reverseIt(arr)));
        revPrac(arr);
        System.out.println(Arrays.toString(arr));

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

    private static void revPrac(int[] arr) {
     int low = 0;
     int high = arr.length - 1;


     while(low < high) {
         swap(arr, low, high);
         low++;
         high--;
     }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}
