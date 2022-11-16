package arrays;

public class MaxSumSubarr {

    private static int maxSumSub(int[] arr) {

        int maxSum = 0;
        int maxSumEndingWithIndex = 0;

        for(int i=0; i<arr.length; i++) {
            maxSumEndingWithIndex = Math.max(maxSumEndingWithIndex + arr[i], maxSumEndingWithIndex);
            maxSum = Math.max(maxSumEndingWithIndex, maxSum);
        }

        return maxSum;
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int sum = maxSumSub(arr);
        System.out.println(sum);
    }
}
