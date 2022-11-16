package binaryheap;

import java.util.Arrays;

public class MinHeap {
    int[] minHeap;
    int size;
    int capacity;

    MinHeap(int capacity) {
        minHeap = new int[capacity];
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

    static MinHeap createBasicHeap() {
        MinHeap heap = new MinHeap(14);
        heap.capacity = 14;

        heap.minHeap[0] = 10;
        heap.minHeap[1] = 20;
        heap.minHeap[2] = 15;
        heap.minHeap[3] = 40;
        heap.minHeap[4] = 50;
        heap.minHeap[5] = 100;
        heap.minHeap[6] = 25;
        heap.minHeap[7] = 45;

        heap.size = 8;

        return heap;
    }

    static MinHeap createBadHeap1() {
        MinHeap heap = new MinHeap(14);
        heap.capacity = 14;

        heap.minHeap[0] = 40;
        heap.minHeap[1] = 20;
        heap.minHeap[2] = 30;
        heap.minHeap[3] = 35;
        heap.minHeap[4] = 25;
        heap.minHeap[5] = 80;
        heap.minHeap[6] = 32;
        heap.minHeap[7] = 100;
        heap.minHeap[8] = 70;
        heap.minHeap[9] = 60;

        heap.size = 10;

        return heap;
    }

    static MinHeap createBadHeap2() {
        MinHeap heap = new MinHeap(14);
        heap.capacity = 14;

        heap.minHeap[0] = 40;
        heap.minHeap[1] = 20;
        heap.minHeap[2] = 30;
        heap.minHeap[3] = 35;
        heap.minHeap[4] = 25;
        heap.minHeap[5] = 80;
        heap.minHeap[6] = 32;
        heap.minHeap[7] = 100;
        heap.minHeap[8] = 70;
        heap.minHeap[9] = 60;

        heap.size = 10;

        return heap;
    }

    @Override
    public String toString() {
        return "MinHeap{" +
                "minHeap=" + Arrays.toString(minHeap) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}

class BinaryTreePairNode {

}
