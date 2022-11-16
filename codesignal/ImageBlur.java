package codesignal;

import java.util.Arrays;

public class ImageBlur {


    private static int[][] blurImg(int[][] mat) {

        int R = mat.length;
        int C = mat[0].length;

        int[][] res = new int[R - 2][C - 2];

        for (int i = 1; i < R - 1; i++) {
            for (int j = 1; j < C - 1; j++) {
                res[i - 1][j - 1] = getAvg(mat, i, j);
            }
        }
        return res;
    }

    private static int getAvg(int[][] mat, int r, int c) {

        int avg = (mat[r - 1][c - 1] + mat[r - 1][c] + mat[r - 1][c + 1] + mat[r][c - 1] + mat[r][c] + mat[r][c + 1]
                + mat[r + 1][c - 1] + mat[r + 1][c] + mat[r + 1][c + 1]) / 9;
        return avg;
    }

    public static void main(String[] args) {
//        int[][] mat = {
//                {1, 1, 1},
//                {1, 7, 1},
//                {1, 1, 1}
//        };

        int[][] mat = {
                {7, 4, 0, 1},
                {5, 6, 2, 2},
                {6, 10, 7, 8},
                {1, 4, 2, 0}
        };

        int[][] res = blurImg(mat);
        System.out.println(Arrays.deepToString(res));
    }

}
