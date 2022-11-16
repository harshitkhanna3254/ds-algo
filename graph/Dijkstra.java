package graph;

import java.util.Arrays;

public class Dijkstra {

    static void printMinDistArray(int[][] graph, int source) {

        int[] distance = new int[graph.length];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        boolean[] finalized = new boolean[graph.length];

        for (int i = 0; i < graph.length - 1; i++) {

            //pick min
            int u = -1;
            for (int v = 0; v < graph.length; v++) {
                if (finalized[v] == false && (u == -1 || distance[v] < distance[u]))
                    u = v;
            }

            finalized[u] = true;

            //relax all adjacents
            for (int v = 0; v < graph.length; v++) {
                if (finalized[v] == false && graph[u][v] != 0)
                    distance[v] = Math.min(distance[v], distance[u] + graph[u][v]);
            }
        }

        System.out.println(Arrays.toString(distance));
    }


    public static void main(String[] args) {
//        int[][] graph = {
//                {0, 5, 10, 0},
//                {5, 0, 3, 20},
//                {10, 3, 0, 2},
//                {0, 20, 2, 0}
//        };

        int[][] graph = {
                {0,5,3},
                {5,0,1},
                {3,1,0}
        };

        int source = 1;

        printMinDistArray(graph, source);
    }


}
