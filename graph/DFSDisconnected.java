package graph;

import java.util.ArrayList;

public class DFSDisconnected {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = AdjList.createDisconnectedgraph1();
        int V = adjList.size();
        boolean[] visited = new boolean[V];

        System.out.println("DFS of graph: ");

        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                DFS.DFS(adjList, visited, i);
            }
        }
    }
}
