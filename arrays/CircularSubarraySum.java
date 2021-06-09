package arrays;

public class CircularSubarraySum {
    public static void main(String[] args) {

        int[] arr = { 10, 5, -5 };

        int[] arr2 = { 8, -4, 3, -5, 4 };

        System.out.println(curcularSumNaive(arr2));
        System.out.println(curcularSumEff(arr2));

    }

    static int curcularSumEff(int[] arr) {

        int res = arr[0];

        int maxNormal = kadane(arr);

        if (maxNormal < 0)
            return maxNormal;

        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
            arr[i] = -arr[i];
        }

        int max_circular = arrSum - (-kadane(arr));

        return Math.max(maxNormal, max_circular);
    }

    static int kadane(int[] arr) {

        int res = arr[0];

        int[] endMax = new int[arr.length];
        endMax[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            endMax[i] = Math.max(arr[i], endMax[i - 1] + arr[i]);
            res = Math.max(res, endMax[i]);
        }

        return res;
    }

    static int curcularSumNaive(int[] arr) {

        int res = 0;

        int n = arr.length;

        // beginning max sum
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = 0; j < n; j++) {
                int index = (j + i) % n;
                curr = Integer.max(curr + arr[index], arr[index]);
                res = Math.max(curr, res);
                // System.out.println(curr + " " + res);
            }
        }

        return res;
    }

}
