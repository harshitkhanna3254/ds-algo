package dynamic_programming.knapsack01;

public class SubsetSum {

    static boolean[][] memo;

    private static boolean findIfPresent(int[] arr, int sum, int n) {

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {

                if (i == 0)
                    memo[i][j] = true;

                else if (j == 0)
                    memo[i][j] = false;

                else if (arr[i - 1] < j)
                    memo[i][j] = memo[i - 1][j - arr[i - 1]] || memo[i - 1][j];

                else
                    memo[i][j] = memo[i - 1][j];
            }
        }

        return memo[n][sum];
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 8, 10};
        int n = arr.length;
        int sum = 11;

        memo = new boolean[n + 1][sum + 1];

        boolean isPresent = findIfPresent(arr, sum, n);
        System.out.println(isPresent);
    }
}
