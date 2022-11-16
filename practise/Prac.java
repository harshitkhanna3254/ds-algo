package practise;

import java.util.Arrays;
import java.util.HashMap;

import javax.print.DocFlavor.CHAR_ARRAY;

public class Prac {
    public static void main(String[] args) {

        int[] arr = {2, 3, 7, 5, 10};
        int sum = 11;
        int n = arr.length;


        System.out.println("Exists? : " + existsPair(arr, sum, n));

    }


    private static boolean existsPair(int[] arr, int sum, int n) {

        boolean[][] memo = new boolean[n + 1][sum + 1];

        for (int i = 0; i <= n; i++)
            memo[i][0] = true;

        for (int i = 1; i <= sum; i++)
            memo[0][i] = false;


        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {

                if (j >= arr[i - 1])
                    memo[i][j] = memo[i - 1][j - arr[i - 1]] || memo[i - 1][j];

                else
                    memo[i][j] = memo[i - 1][j];
            }
        }

        return memo[n][sum];
    }

}