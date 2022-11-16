package graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {


    private static void bfs(int[][] grid, int row, int col, int rows, int cols, boolean[][] visited) {
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(row, col));
        visited[row][col] = true;

        while (!queue.isEmpty()) {
            Pair topPair = queue.poll();
            int x = topPair.x;
            int y = topPair.y;

            Pair[] directions = {new Pair(1, 0), new Pair(-1, 0),
                    new Pair(0, 1), new Pair(0, -1)};

            for (Pair p : directions) {
                int r = x + p.x;
                int c = y + p.y;

                if (r < rows && r >= 0 && c < cols && c >= 0 &&
                        grid[r][c] == 1 && !visited[r][c]) {
                    visited[r][c] = true;
                    queue.add(new Pair(r, c));
                }
            }
        }
    }

    private static int numberOfIslands(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (rows == 0 || cols == 0)
            return 0;

        boolean[][] visitedGrid = new boolean[rows][cols];

        int res = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visitedGrid[i][j]) {
                    bfs(grid, i, j, rows, cols, visitedGrid);
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}};

        int res = numberOfIslands(grid);
        System.out.println("Number of islands: " + res);
    }

}

