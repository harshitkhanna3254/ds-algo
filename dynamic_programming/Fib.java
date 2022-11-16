package dynamic_programming;

import java.util.Arrays;

public class Fib {

    static int N = 20;
    static int[] memo = new int[N + 1];

    private static int fib(int n) {

        int res = 0;

        if (memo[n] == -1) {
            if (n == 0 || n == 1)
                res = n;
            else
                res = fib(n - 1) + fib(n - 2);

            memo[n] = res;
        }

        return res;
    }

    private static int fibBottomUp(int n) {

        int[] res = new int[n + 1];

        res[0] = 0;
        res[1] = 1;

        for (int i = 2; i <= n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }

        return res[n];

    }

    public static void main(String[] args) {
        Arrays.fill(memo, -1);
        int res = fib(N);
        System.out.println("Top Down Recursion Fib: " + res);

        int res2 = fibBottomUp(N);
        System.out.println("Bottom Up Recursion Fib: " + res2);
    }

}

