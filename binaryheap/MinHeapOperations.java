package binaryheap;

import java.util.Arrays;

public class MinHeapOperations {
    static void extractMin(MinHeap heap) {
        // swap first and last node.
        // call heapify for the replaced first node. It will automatically go in it's place

        int minNode = heap.minHeap[0];
        int lastNode = heap.minHeap[heap.size - 1];

        swap(heap.minHeap, minNode, lastNode);

        heap.minHeap[heap.size - 1] = 0;
        heap.size--;

        Heapify.minHeapify(heap, heap.capacity, 0);

    }

    static MinHeap buildMinHeapFromArray(int[] arr) {

//        we have to call heapify for multiple elements. Thats clear
//        from which node to start? bottommost? No. The parent of the bottommost.

        MinHeap heap = new MinHeap(arr.length);
        heap.minHeap = Arrays.copyOf(arr, arr.length);
        heap.size = arr.length;

        int startIndex = heap.parent(arr.length - 1);

        for (int i = startIndex; i >= 0; i--) {
            Heapify.minHeapify(heap, heap.size, i);
        }

        System.out.println("After building heap from array");
        System.out.println(heap);

        return heap;
    }

    static void decreaseKey(MinHeap heap, int index, int newKey) {

        heap.minHeap[index] = newKey;

        int pIdx = heap.parent(index);

        if (heap.minHeap[pIdx] > heap.minHeap[index] && index != 0) {
            swap(heap.minHeap, pIdx, index);
            decreaseKey(heap, pIdx, newKey);
        }

    }

    static void swap(int[] arr, int idx1, int idx2) {
        int temp;
        temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        MinHeap heap = MinHeap.createBasicHeap();
        System.out.println(heap);

        int indexToBeDecreased = 3;
        int newKey = 12;
        decreaseKey(heap, indexToBeDecreased, newKey);

        System.out.println("After decreaseKey");
        System.out.println(heap);

        System.out.println("-------------------------------");
        System.out.println("Build heap from array ..");
        int[] arr = {10, 4, 40, 23, 60, 124, 421, 93, 49, 48, 41, 32, 77};
        System.out.println(Arrays.toString(arr));
        buildMinHeapFromArray(arr);


    }
}
