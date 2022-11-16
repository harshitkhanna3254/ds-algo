package graph;


import java.util.ArrayList;

class AdjListNode {
    private int vertices;
    private int weight;

    AdjListNode(int vertices, int weight) {
        this.vertices = vertices;
        this.weight = weight;
    }

    int getVertices() {
        return vertices;
    }

    int getWeight() {
        return weight;
    }
}

public class AdjListDirectedWeighted {

    private int V;
    ArrayList<ArrayList<AdjListNode>> adjListDirectedWeighted;


}
