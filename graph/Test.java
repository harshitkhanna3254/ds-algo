package graph;

import java.util.HashSet;

public class Test {

    public static void main(String[] args) {
        HashSet<Pair> hashSet = new HashSet<>();

        Pair p = new Pair(1, 2);

        hashSet.add(p);


        if (hashSet.contains(new Pair(1,2))) {
            System.out.println("Hello");
        }



    }
}
