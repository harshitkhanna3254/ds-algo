package binaryheap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KSortedArray {


    static void sortKSorted(int[] arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int currIdx = 0;


        for (int i = 0; i <= k; i++)
            minHeap.add(arr[i]);

        for (int i = k + 1; i < arr.length; i++) {
            arr[currIdx++] = minHeap.poll();
            minHeap.add(arr[i]);
        }

        while (minHeap.isEmpty() == false) {
            arr[currIdx++] = minHeap.poll();
        }

    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;

        sortKSorted(arr, k);

        System.out.println(Arrays.toString(arr));
    }

}
