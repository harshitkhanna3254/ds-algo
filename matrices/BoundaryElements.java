package matrices;

public class BoundaryElements {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        printboundaryElements(arr, 4, 4);

        // int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

        // int[][] arr = { { 1 }, { 2 }, { 3 }, { 4 } };
        // printboundaryElements(arr, 4, 1);
    }

    public static void printboundaryElements(int[][] arr, int R, int C) {

        if (R == 1) {
            for (int i = 0; i < C; i++) {
                System.out.print(arr[0][i] + " ");
            }
            return;
        } else if (C == 1) {
            for (int i = 0; i < R; i++) {
                System.out.print(arr[i][0] + " ");
            }
            return;
        }

        for (int i = 0; i < C; i++) {
            System.out.print(arr[0][i] + " ");
        }

        for (int i = 1; i < R; i++) {
            System.out.print(arr[i][arr[i].length - 1] + " ");
        }

        for (int k = C - 2; k >= 0; k--) {
            System.out.print(arr[arr.length - 1][k] + " ");
        }

        for (int x = R - 2; x > 0; x--) {
            System.out.print(arr[x][0] + " ");
        }

    }
}
