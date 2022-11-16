package binaryheap;

import java.util.Arrays;

public class MaxHeap {

    int[] maxHeap;
    int size;
    int capacity;

    @Override
    public String toString() {
        return "MaxHeap{" +
                "maxHeap=" + Arrays.toString(maxHeap) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

    MaxHeap(int capacity) {
        maxHeap = new int[capacity];
        size = 0;
        this.capacity = capacity;
    }

    int left(int index) {
        return (2 * index + 1);
    }

    int right(int index) {
        return (2 * index + 2);
    }

    int parent(int index) {
        return (int) Math.floor((index - 1) / 2);
    }

    static MaxHeap createBasicMaxHeap1() {
        MaxHeap heap = new MaxHeap(8);

        int[] tempArr = {50, 30, 15, 19, 20, 10, 5, 2};

        heap.maxHeap = Arrays.copyOf(tempArr, tempArr.length);

        heap.size = tempArr.length;

        return heap;
    }

    static MaxHeap createBasicMaxHeap2() {
        MaxHeap heap = new MaxHeap(20);

        int[] tempArr = {323, 252, 282, 121, 131, 222, 141, 66, 111, 85, 50, 182, 107, 64, 91, 15, 20};

        copyArray(heap.maxHeap, tempArr);

        heap.size = tempArr.length;

        return heap;
    }

    static MaxHeap createBadMaxHeap1() {
        MaxHeap heap = new MaxHeap(11);

        int[] tempArr = {21, 35, 55, 22, 31, 43, 7, 13, 9, 1, 2};

        copyArray(heap.maxHeap, tempArr);

        heap.size = tempArr.length;

        return heap;
    }

    private static void copyArray(int[] maxHeapArr, int[] tempArr) {
        for (int i = 0; i < tempArr.length; i++) {
            maxHeapArr[i] = tempArr[i];
        }
    }

}
