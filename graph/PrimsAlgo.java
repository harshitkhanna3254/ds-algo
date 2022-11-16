package graph;

import java.util.ArrayList;

public class PrimsAlgo {

    static int findMinSpan(int[][] graph) {
        int V = graph.length;

        //key-set
        int[] keySet = new int[V];
        keySet[0] = 0;
        for (int i = 1; i < keySet.length; i++)
            keySet[i] = Integer.MAX_VALUE;

        //min span tree set
        boolean[] resultSet = new boolean[V];

        int res = 0;
        for (int i = 0; i < V; i++) {

            int minElement = -1;
            for (int p = 0; p < V; p++) {
                if (resultSet[i] == false && (minElement == -1 || keySet[i] < keySet[p]))
                    minElement = i;
            }

            resultSet[minElement] = true;
            res = res + keySet[minElement];

            // change keySet as per the min-span-tree set
            for (int p = 0; p < V; p++) {
                if (resultSet[p] == false && graph[minElement][p] != 0 && graph[minElement][p] < keySet[p])
                    keySet[p] = graph[minElement][p];
            }
        }

        return res;
    }

    public static void main(String[] args) {
//        int[][] graph = new int[][]{
//                {0, 2, 0, 6, 0},
//                {2, 0, 3, 8, 5},
//                {0, 3, 0, 0, 7},
//                {6, 8, 0, 0, 9},
//                {0, 5, 7, 9, 0}
//        };

        int[][] graph = new int[][]{
                {0, 5, 8, 0},
                {5, 0, 10, 15},
                {8, 10, 0, 20},
                {0, 15, 20, 0}
        };

        int minSpanTreeWeight = findMinSpan(graph);
        System.out.println(minSpanTreeWeight);
    }
}
