package arrays;

public class LongestEvenOdd {

    public static void main(String[] args) {

        int[] arr = { 5, 10, 20, 6, 3, 8 };

        int[] arr1 = { 10, 12, 14, 7, 8 };

        System.out.println(evenOdd(arr));

    }

    static int evenOdd(int[] arr) {

        int res = 1;
        int curr = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i - 1] % 2 != 0 || arr[i] % 2 != 0 && arr[i - 1] % 2 == 0) {
                curr++;
                res = Math.max(curr, res);
            } else {
                curr = 1;
            }
        }

        return res;
    }

}
