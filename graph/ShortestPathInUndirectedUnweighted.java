package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class ShortestPathInUndirectedUnweighted {


    static void BFS(ArrayList<ArrayList<Integer>> adjList, int source, boolean[] visited) {


    }

    static void printShortestPathArray(ArrayList<ArrayList<Integer>> adjList, int source) {
        boolean[] visited = new boolean[adjList.size()];
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        int[] shortestPathArray = new int[adjList.size()];

        Arrays.fill(shortestPathArray, -1);

        visited[source] = true;
        arrayDeque.add(source);
        shortestPathArray[source] = 0;

        while (!arrayDeque.isEmpty()) {
            int top = arrayDeque.pop();

            for (int u : adjList.get(top)) {
                if (visited[u] == false) {
                    arrayDeque.add(u);
                    shortestPathArray[u] = shortestPathArray[top] + 1;
                    visited[u] = true;
                }
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(shortestPathArray));

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = AdjList.createBasicGraph3();
        int source = 2;

        printShortestPathArray(adjList, source);
    }
}
