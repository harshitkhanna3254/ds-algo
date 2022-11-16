package practise;

import java.util.ArrayList;

public class PracGraph {

    // Function to convert adjacency
    // list to adjacency matrix
    static ArrayList<ArrayList<Integer>> convert(int[][] a) {
        // no of vertices
        int l = a[0].length;
        ArrayList<ArrayList<Integer>> adjListArray
                = new ArrayList<ArrayList<Integer>>(l);

        // Create a new list for each
        // vertex such that adjacent
        // nodes can be stored
        for (int i = 0; i < l; i++) {
            adjListArray.add(new ArrayList<Integer>());
        }

        int i, j;
        for (i = 0; i < a[0].length; i++) {
            for (j = 0; j < a.length; j++) {
                if (a[i][j] == 1) {
                    adjListArray.get(i).add(j);
                }
            }
        }

        return adjListArray;
    }

    // Function to print the adjacency list
    static void printArrayList(ArrayList<ArrayList<Integer>>
                                       adjListArray) {
        // Print the adjacency list
        for (int v = 0; v < adjListArray.size(); v++) {
            System.out.print(v);
            for (Integer u : adjListArray.get(v)) {
                System.out.print(" -> " + u);
            }
            System.out.println();
        }
    }

    // Driver Code
    public static void main(String[] args) {
        // Given Adjacency Matrix
        int[][] a = {{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 1}};

        // function to convert adjacency
        // list to adjacency matrix
        ArrayList<ArrayList<Integer>> adjListArray = convert(a);
        System.out.println("Adjacency List: ");

        printArrayList(adjListArray);
    }
}
