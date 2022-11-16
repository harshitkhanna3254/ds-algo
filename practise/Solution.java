package practise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int numIslands(char[][] grid) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        char zero = '0';
        char one = '1';

        for(int i=0; i<grid.length; i++) {
            adjList.add(new ArrayList<Integer>());
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == one && i != j)
                    adjList.get(i).add(j);
            }
        }

        System.out.println(adjList);

        int V = adjList.size();
        boolean[] visited = new boolean[V];

        int count = 0;
        for(int i=0; i<V; i++) {
            if(visited[i] == false) {
                BFS(adjList, visited, i);
                count++;
            }
        }

        return count;
    }


    private void BFS(ArrayList<ArrayList<Integer>> adjList, boolean[] visited, int source) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);


        while(!queue.isEmpty()) {
            int top = queue.poll();

            for(int u : adjList.get(top)) {
                System.out.print(u + " ");
                if(visited[u] == false) {
                    visited[u] = true;
                    queue.add(u);
                }
            }
        }

    }
}