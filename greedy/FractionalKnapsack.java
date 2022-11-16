package greedy;

import java.util.Arrays;

public class FractionalKnapsack {


    private static double fractionalKnapsack(Pair[] objects, int knapsackLimit) {

        Arrays.sort(objects, new MyCmpWeightedAvg());
        System.out.println(Arrays.toString(objects));

        knapsackLimit -= objects[0].getX();
        double res = objects[0].getY();

        for (int i = 1; i < objects.length; i++) {
            if (knapsackLimit - objects[i].getX() > 0) {
                knapsackLimit -= objects[i].getX();
                res += objects[i].getY();
            } else {
                res += (knapsackLimit / (double) objects[i].getX()) * (double) objects[i].getY();
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Pair[] objects = new Pair[4];
        objects[0] = new Pair(10, 60);
        objects[1] = new Pair(40, 40);
        objects[2] = new Pair(20, 100);
        objects[3] = new Pair(30, 120);

        int W = 50;

        double fractionalKnapsackValue = fractionalKnapsack(objects, W);
        System.out.println("Max value: " + fractionalKnapsackValue);
    }

}
