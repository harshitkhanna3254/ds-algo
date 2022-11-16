package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class BFS {

    static void printBFS(ArrayList<ArrayList<Integer>> adjList, boolean[] visited, int source) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        visited[source] = true;
        arrayDeque.add(source);

        while (arrayDeque.isEmpty() == false) {
            int top = arrayDeque.pop();
            System.out.print(top + " ");
            for (int v : adjList.get(top)) {
                if (visited[v] == false) {
                    arrayDeque.add(v);
                    visited[v] = true;
                }
            }
        }
    }

    static void BFSDisconnected(ArrayList<ArrayList<Integer>> adjList, int V) {

        boolean[] visited = new boolean[V];
        int count = 0;
        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                count++;
                printBFS(adjList, visited, i);
            }
        }

        System.out.println("\nThe number of islands in this graph is: " + count);
    }


    public static void main(String[] args) {

//        ArrayList<ArrayList<Integer>> adjList = AdjList.createBasicGraph1();
        ArrayList<ArrayList<Integer>> adjList = AdjList.createDisconnectedgraph1();

//        System.out.println(adjList);

        int V = adjList.size();
        int source = 0;

        System.out.println("Following is Breadth First Traversal: ");
        BFSDisconnected(adjList, V);
    }

}
