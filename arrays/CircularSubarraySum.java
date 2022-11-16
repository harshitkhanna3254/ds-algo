package arrays;

public class CircularSubarraySum {
    public static void main(String[] args) {

        int[] arr = {10, 5, -5};

        int[] arr2 = {8, -4, 3, -5, 4};

        System.out.println(circ(arr2));
    }

    private static int circ(int[] arr) {

        int maxSumNormal = kadane(arr);

        if (maxSumNormal < 0) {
            return maxSumNormal;
        }

        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];
            arr[i] = -arr[i];
        }

        int maxSumInverted = kadane(arr);

        int maxCircular = arrSum - (-maxSumInverted);

        return Math.max(maxSumNormal, maxCircular);

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

}
