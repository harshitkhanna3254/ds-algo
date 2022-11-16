package backtracking;

public class NQueen {

    static int N = 4;
    static int board[][] = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
    };

    private static boolean isSafe(int row, int col) {

        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1)
                return false;
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    private static boolean possibleNQueen(int col) {

        if (col == N)
            return true;

        for (int i = 0; i < N; i++) {
            if (isSafe(i, col)) {
                board[i][col] = 1;
                if (possibleNQueen(col + 1) == true)
                    return true;
                board[i][col] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        boolean possibleNQueen = possibleNQueen(0);
        System.out.println("Possible?: " + possibleNQueen);

        printSolution(board);
    }

    static void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j] + " ");
            System.out.println();
        }
    }

}
