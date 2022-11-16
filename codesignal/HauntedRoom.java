package codesignal;

public class HauntedRoom {

    private static int getSum(int[][] mat) {

        int R = mat.length;
        int C = mat[0].length;

        int res = 0;

        for (int i = 0; i < C; i++) {
            int colVal = 0;
            while (colVal < R && mat[colVal][i] != 0) {
                res += mat[colVal][i];
                colVal++;
            }
        }
        return res;
    }


    public static void main(String[] args) {
//        int[][] mat = {
//                {0, 1, 1, 2},
//                {0, 5, 0, 0},
//                {2, 0, 3, 3}
//        };

        int[][] mat = {
                {1, 1, 1, 2},
                {5, 5, 0, 0},
                {2, 0, 3, 3}
        };

        int res = getSum(mat);
        System.out.println(res);
    }
}
