package matrices;

public class Spiral {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
        printMatrix(mat);
        System.out.println();
        System.out.println();
        printSpiral(mat, 5, 4);
    }

    public static void printSpiral(int[][] mat, int R, int C) {
        int top = 0;
        int left = 0;
        int bottom = R - 1;
        int right = C - 1;

        int direction = 0;

        while (top <= bottom && left <= right) {

            if (direction == 0) {
                for (int i = left; i <= right; i++)
                    System.out.print(mat[top][i] + " ");
                top++;
            } else if (direction == 1) {
                for (int i = top; i <= bottom; i++)
                    System.out.print(mat[i][right] + " ");
                right--;
            } else if (direction == 2) {
                for (int i = right; i >= left; i--)
                    System.out.print(mat[bottom][i] + " ");
                bottom--;
            } else if (direction == 3) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(mat[i][left] + " ");
                left++;
            }

            direction = (direction + 1) % 4;

        }

    }

    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
