package graph;

import java.util.ArrayList;

public class DetectCycleDirected {

    static boolean detectCycleDirectedDFS(ArrayList<ArrayList<Integer>> adjListDirected, boolean[] visited,
                                           boolean[] inStack, int source) {

        visited[source] = true;
        inStack[source] = true;

        for (int u : adjListDirected.get(source)) {
            if (visited[u] == false) {
                return detectCycleDirectedDFS(adjListDirected, visited, inStack, u);
            } else {
                if(inStack[u] == true)
                    return true;
            }
        }
        inStack[source] = false;
        return false;
    }


    static boolean detectCycle(ArrayList<ArrayList<Integer>> adjListDirected) {
        boolean[] visited = new boolean[adjListDirected.size()];
        boolean[] inStack = new boolean[adjListDirected.size()];

        for (int i = 0; i < adjListDirected.size(); i++) {
            if (visited[i] == false) {
                return detectCycleDirectedDFS(adjListDirected, visited, inStack, i);
            }
        }

        return false;
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjListDirected = AdjListDirected.createDirectedGraphWithLoop1();

        boolean hasCycle = detectCycle(adjListDirected);
        System.out.println("The given directed graph has cycle? (DFS) : " + hasCycle);

    }
}
