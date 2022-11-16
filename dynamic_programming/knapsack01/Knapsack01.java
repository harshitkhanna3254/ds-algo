package dynamic_programming.knapsack01;

import java.util.Arrays;

public class Knapsack01 {


    private static int knapsack(int[] weights, int[] values, int W, int n) {
        if (W == 0 || n == 0) return 0;

        if (weights[n - 1] <= W) {
            return Math.max(values[n - 1] + knapsack(weights, values, W - weights[n - 1], n - 1), knapsack(weights, values, W, n - 1));
        } else {
            return knapsack(weights, values, W, n - 1);
        }
    }

    static int[][] memo;

    private static int knapsackMemo(int[] weights, int[] values, int W, int n) {
        if (W == 0 || n == 0) return 0;

        if (memo[W][n] != -1) return memo[W][n];

        if (weights[n - 1] <= W) {
            return memo[W][n] = Math.max(values[n - 1] + knapsack(weights, values, W - weights[n - 1], n - 1), knapsack(weights, values, W, n - 1));
        } else {
            return memo[W][n] = knapsack(weights, values, W, n - 1);
        }
    }

    private static int knapsackTopDown(int[] weights, int[] values, int W, int n) {
        if (W == 0 || n == 0) return 0;

        int[][] memoTopDown = new int[n + 1][W+1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {

                if (weights[i - 1] <= j) {
                    memoTopDown[i][j] = Math.max(values[i - 1] + memoTopDown[i - 1][j - weights[i - 1]],
                            memoTopDown[i-1][j]);
                } else {
                    memoTopDown[i][j] = memoTopDown[i-1][j];
                }
            }
        }

        return memoTopDown[n][W];

    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 1, 4};
        int[] values = {4, 5, 3, 7};
        int n = weights.length;
        int W = 5;

        memo = new int[W][n];
        for (int[] row : memo)
            Arrays.fill(row, -1);

        int res = knapsack(weights, values, W, n);
        System.out.println("Max profit we can get: " + res);

        int resTopDown = knapsackTopDown(weights, values, W, n);
        System.out.println("Max profit we can get: " + resTopDown);
    }
}
