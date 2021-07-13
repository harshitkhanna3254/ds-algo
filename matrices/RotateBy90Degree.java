package matrices;

public class RotateBy90Degree {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int R = 4;
        int C = 4;
        transposeMatrix(arr, R, C);
        reverseColumns(arr, R, C);

    }

    public static void reverseColumns(int[][] arr, int R, int C) {

        for (int i = 0; i < arr.length; i++) {
            int low = 0;
            int high = arr.length - 1;

            while (low < high) {
                int temp = arr[low][i];
                arr[low][i] = arr[high][i];
                arr[high][i] = temp;

                low++;
                high--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int[][] arr, int R, int C) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                swapComplement(arr, i, j);
            }
        }

    }

    static void swapComplement(int[][] arr, int x, int y) {

        int temp = arr[x][y];
        arr[x][y] = arr[y][x];
        arr[y][x] = temp;
    }
}
