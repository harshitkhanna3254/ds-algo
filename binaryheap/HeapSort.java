package binaryheap;

import java.util.Arrays;

public class HeapSort {

    static MinHeap heapsortDec(int[] arr) {
        MinHeap heap = MinHeapOperations.buildMinHeapFromArray(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            Heapify.swap(heap.minHeap, 0, i);
            Heapify.minHeapify(heap, i, 0);
        }

        return heap;

    }


    public static void main(String[] args) {
        int[] arr = {5, 10, 3, 8, 1, 2, 9, 0, 7, 4};
        System.out.println("Given Array: ");
        System.out.println(Arrays.toString(arr));
        MinHeap mHeap1 = heapsortDec(arr);
        System.out.println("After heapsort dec: ");
        System.out.println(mHeap1);
    }
}
