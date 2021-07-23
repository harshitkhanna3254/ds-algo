package hashing;

public class EqualZerosOnesLongestSubarray {
    public static void main(String[] args) {

        int[] arr = { 1, 0, 1, 1, 1, 0, 0 };

        // int[] arr = { 1,1,1,1 };

        // int[] arr = {0,0,1,1,1,1,1,1,0};

        // int[] arr = { 0,0,1,0,1,1 };

        System.out.println(equalZerosAndOnesNaive(arr));

    }

    private static int equalZerosAndOnesNaive(int[] arr) {

        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            int c0 = 0;
            int c1 = 0;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0)
                    c0++;
                else
                    c1++;

                if (c0 == c1)
                    res = Math.max(res, c0 + c1);
            }
        }

        return res;

    }

    /* ------------------------ Convert all zeros to -1. ------------------------ */
    /* -------- Problem same as find longest subarray with given sum = 0 -------- */
    private static int equalZerosAndOnesEfficient(int[] arr) {
        return 1;
    }
}
