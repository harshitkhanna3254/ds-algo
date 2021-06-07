package arrays;

public class MaxDiff {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 10, 6, 4, 8, 1 };

        int[] arr1 = { 10, 20, 0, 0, 30, 0, 40, 0, 40, 0 };

        System.out.println(maxDiff(arr));
    }

    static int maxDiff(int[] arr) {

        int min = arr[0];

        int res = 0;

        for (int i = 1; i < arr.length; i++) {
            res = Math.max(arr[i] - min, res);
            min = Math.min(arr[i], min);
        }

        return res;
    }
}
