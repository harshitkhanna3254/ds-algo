package binaryheap;


import java.util.Collections;
import java.util.PriorityQueue;

public class KClosestNumbers {


    static void printKClosest(int[] arr, int x, int k) {

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < k; i++)
            maxHeap.add(new Pair(Math.abs(arr[i] - x), i));


        for (int i = k; i < arr.length; i++) {

        }


    }

    static class Pair {
        int key;
        int link;

        Pair(int key, int link) {
            this.key = key;
            this.link = link;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "key=" + key +
                    ", link=" + link +
                    '}';
        }
    }

    public static void main(String[] args) {
        int[] arr = {30, 40, 32, 33, 36, 37};

        int x = 38;
        int k = 3;

        MaxHeapOperations.buildMaxHeapFromArray(arr);

        printKClosest(arr, x, k);
    }

}
