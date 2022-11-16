package graph;

import java.util.ArrayList;

public class AdjList {


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int V = 5;


        for (int i = 0; i < V; i++)
            adjList.add(new ArrayList<>());

        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);

        printAdjList(adjList);

    }

    static void printAdjList(ArrayList<ArrayList<Integer>> adjList) {
        for (int i = 0; i < adjList.size(); i++) {
            for (int j = 0; j < adjList.get(i).size(); j++)
                System.out.print(adjList.get(i).get(j) + " ");
            System.out.println();
        }
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static ArrayList<ArrayList<Integer>> createBasicGraph1() {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int V = 5;

        for (int i = 0; i < V; i++)
            adjList.add(new ArrayList<>());

        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 2, 4);
        addEdge(adjList, 3, 4);

        return adjList;
    }

    static ArrayList<ArrayList<Integer>> createBasicGraph2() {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int V = 5;

        for (int i = 0; i < V; i++)
            adjList.add(new ArrayList<>());

        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 3, 4);
        addEdge(adjList, 2, 4);

        return adjList;
    }

    static ArrayList<ArrayList<Integer>> createBasicGraph3() {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int V = 4;

        for (int i = 0; i < V; i++)
            adjList.add(new ArrayList<>());

        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 2, 3);

        return adjList;
    }

    static ArrayList<ArrayList<Integer>> createDisconnectedgraph1() {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int V = 9;

        for (int i = 0; i < V; i++)
            adjList.add(new ArrayList<>());

        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 3, 4);
        addEdge(adjList, 5, 6);
        addEdge(adjList, 5, 7);
        addEdge(adjList, 7, 8);

        return adjList;
    }


}
