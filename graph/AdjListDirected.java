package graph;

import java.util.ArrayList;


public class AdjListDirected {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int destination) {
        adj.get(source).add(destination);
    }

    static ArrayList<ArrayList<Integer>> createDirectedGraphWithLoop1() {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int V = 4;

        for (int i = 0; i < V; i++)
            adjList.add(new ArrayList<>());

        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 2, 0);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 3, 3);
        return adjList;
    }

    static ArrayList<ArrayList<Integer>> createDirectedGraphWithoutLoop1() {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int V = 5;

        for (int i = 0; i < V; i++)
            adjList.add(new ArrayList<>());

        addEdge(adjList, 0, 2);
        addEdge(adjList, 0, 3);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 1, 4);
        addEdge(adjList, 2, 3);

        return adjList;
    }


}
