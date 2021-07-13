package matrices;

public class Transpose {

    /* -------------------------------------------------------------------------- */
    /* Transpose is always of NXN element matrix (Square) */
    /* -------------------------------------------------------------------------- */

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        transposeMatrixEfficient(arr, 4, 4);

    }

    public static void transposeMatrixEfficient(int[][] arr, int R, int C) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                swapComplement(arr, i, j);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrixNaive(int[][] arr, int R, int C) {

        int[][] transpose = new int[C][R];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void swapComplement(int[][] arr, int x, int y) {

        int temp = arr[x][y];
        arr[x][y] = arr[y][x];
        arr[y][x] = temp;
    }
}
