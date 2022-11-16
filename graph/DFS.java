package graph;

import java.util.ArrayList;

public class    DFS {

    static void DFS(ArrayList<ArrayList<Integer>> adjList, boolean[] visited, int source) {
        visited[source] = true;
        System.out.print(source + " ");

        for (int u : adjList.get(source)) {

            if (visited[u] == false) {
                DFS(adjList, visited, u);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = AdjList.createBasicGraph1();
        int V = adjList.size();
        int source = 0;
        boolean[] visited = new boolean[V];

        System.out.println("DFS of graph: ");

        DFS(adjList, visited, source);
    }

}
