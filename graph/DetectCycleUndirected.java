package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class DetectCycleUndirected {

    static boolean detectCycleBFS(ArrayList<ArrayList<Integer>> adjList) {

        boolean[] visited = new boolean[adjList.size()];
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        int source = adjList.get(0).get(0);
        arrayDeque.add(source);

        visited[source] = true;

        while (!arrayDeque.isEmpty()) {
            int top = arrayDeque.pop();
            int parent = top;

            for (int u : adjList.get(top)) {
                if (visited[u] == false) {
                    arrayDeque.add(u);
                    visited[u] = true;
                } else if (u != parent) {
                    return true;
                }

            }
        }


        return false;
    }

    static boolean printDFS(ArrayList<ArrayList<Integer>> adjList, boolean[] visited, int source, int parent) {

        visited[source] = true;

        for (int u : adjList.get(source)) {
            if (visited[u] == false) {
                boolean hasCycle = printDFS(adjList, visited, u, parent);
                if (hasCycle == true)
                    return true;
            } else {
                if (u != parent)
                    return true;
            }
        }
        return false;
    }

    static boolean detectCycleDFS(ArrayList<ArrayList<Integer>> adjList) {
        boolean[] visited = new boolean[adjList.size()];
        int source = 2;
        int parent = -1;

        return printDFS(adjList, visited, source, parent);
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = AdjList.createBasicGraph1();

        boolean hasCycleBFS = detectCycleBFS(adjList);

        boolean hasCycleDFS = detectCycleDFS(adjList);

        System.out.println();
        System.out.println("Graph has cycle? (BFS) : " + hasCycleBFS);
        System.out.println("Graph has cycle? (DFS) : " + hasCycleDFS);

    }
}
