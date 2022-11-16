package graph;

import java.util.Objects;

public class Pair {
    int x;
    int y;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Pair pair = (Pair) o;
//        return x == pair.x && y == pair.y;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(x, y);
//    }

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
