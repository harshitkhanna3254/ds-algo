package arrays;

public class CircularSubarraySum {
    public static void main(String[] args) {

        int[] arr = { 10, 5, -5 };

        int[] arr2 = { 8, -4, 3, -5, 4 };

        System.out.println(curcularSumNaive(arr2));
        System.out.println(curcularSumEff(arr2));

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

    static int curcularSumEff(int[] arr) {

        int res = arr[0];

        int[] maxEnd = new int[arr.length];
        maxEnd[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnd[i] = Math.max(maxEnd[i - 1] + arr[i], arr[i]);
            res = Math.max(maxEnd[i], res);
        }

        return res;
    }

}
