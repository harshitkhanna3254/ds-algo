package backtracking;

import java.util.Arrays;

public class RatInAMaze {


    private static int[][] findRatPathItr(int[][] maze, int n) {

        int[][] path = new int[n][n];

        int i = 0;
        int j = 0;
        while (i != n - 1 || j != n - 1) {
            if (i != n - 1 && maze[i + 1][j] == 1) {
                i++;
                System.out.println("a");
            } else if (j != n - 1 && maze[i][j + 1] == 1) {
                j++;
                System.out.println("b");
            } else {
                System.out.println("No Path possible");
                break;
            }
        }

        System.out.println(i + " " + j);

        if (i == n - 1 && j == n - 1) {
            System.out.println("Possible");
        }

        return maze;
    }


    private static boolean findRatPathRec(int[][] maze, int n, int i, int j) {

        if (i == n - 1 && j == n - 1) {
            return true;
        }

        if (isSafe(maze, n, i, j)) {
            if (findRatPathRec(maze, n, i + 1, j) == true)
                return true;
            else if (findRatPathRec(maze, n, i, j + 1) == true)
                return true;
        }

        return false;
    }

    private static boolean isSafe(int[][] maze, int n, int i, int j) {
        if (i < n && j < n && maze[i][j] == 1)
            return true;

        return false;
    }

    public static void main(String[] args) {
//        int[][] maze = {
//                {1, 0, 0, 0},
//                {1, 1, 0, 1},
//                {0, 1, 0, 0},
//                {0, 1, 1, 1}
//        };

        int[][] maze = {
                {1, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };

        boolean path = findRatPathRec(maze, maze.length, 0, 0);

        System.out.println(path);
    }
}
