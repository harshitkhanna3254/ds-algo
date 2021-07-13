package matrices;

public class SearchInRowColumnSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 },
                { 38, 42, 50, 77 } };
        int R = 5;
        int C = 4;

        int searchTerm = 29;

        printMatrix(arr);
        System.out.println();
        System.out.println();

        search(arr, R, C, searchTerm);

    }

    public static void search(int[][] arr, int R, int C, int searchTerm) {

        if (searchTerm < arr[0][0] || searchTerm > arr[R - 1][C - 1]) {
            System.out.println("Not Found");
            return;
        }

        int i = 0;
        int j = C - 1;

        while (i < R && j >= 0) {
            if (arr[i][j] == searchTerm) {
                System.out.println("Found at index " + i + "," + j);
                return;
            } else if (searchTerm > arr[i][j]) {
                i++;
            } else if (searchTerm < arr[i][j]) {
                j--;
            }
        }
        System.out.println("Not Found");
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
