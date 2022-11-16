package greedy;

import java.util.Comparator;

public class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class MyCmpAsc implements Comparator<Pair> {

    @Override
    public int compare(Pair o1, Pair o2) {
        return (o1.getY() - o2.getY());
    }
}

class MyCmpDec implements Comparator<Pair> {

    @Override
    public int compare(Pair o1, Pair o2) {
        return (o2.getY() - o1.getY());
    }
}

class MyCmpWeightedAvg implements Comparator<Pair> {

    @Override
    public int compare(Pair o1, Pair o2) {
        return (o2.getY() - o2.getX() - o1.getY() / o1.getX());
    }
}
