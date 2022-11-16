package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;

// Kahn's Algorithm
// This can also be used to find cycle in a graph. Using a count variable, after adding an element we do count++;
// At the end of the queue loop, count should be equal to V for an acyclic graph. count < V for cyclic.

public class TopologicalSort {

    static void printTopsort(ArrayList<ArrayList<Integer>> adjListDirected) {

        boolean[] visited = new boolean[adjListDirected.size()];
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        int[] inDegree = new int[adjListDirected.size()];
        for (int i = 0; i < adjListDirected.size(); i++) {
            for (int u : adjListDirected.get(i)) {
                inDegree[u] = inDegree[u] + 1;
            }
        }

        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0)
                arrayDeque.add(i);
        }

        while (!arrayDeque.isEmpty()) {
            int top = arrayDeque.pop();
            System.out.print(top + " ");

            for (int u : adjListDirected.get(top)) {
                inDegree[u]--;
                if (inDegree[u] == 0)
                    arrayDeque.add(u);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjListDirected = AdjListDirected.createDirectedGraphWithoutLoop1();

        printTopsort(adjListDirected);
    }
}
