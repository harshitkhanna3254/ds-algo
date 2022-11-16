package binaryheap;

public class Prac {

    static void insert(MinHeap heap, int data) {

        heap.size++;
        heap.minHeap[heap.size - 1] = data;

        int pIdx = heap.parent(heap.size - 1);
        int pData = heap.minHeap[pIdx];
        int currIdx = heap.size - 1;

        while (pData > data && currIdx != 0) {
            swap(heap.minHeap, pIdx, currIdx);
            currIdx = pIdx;
            pIdx = heap.parent(currIdx);
            pData = heap.minHeap[pIdx];
        }
    }


    static void heapify(MinHeap badHeap, int badIdx) {

        int lIdx = badHeap.left(badIdx);
        int rIdx = badHeap.right(badIdx);
        int size = badHeap.size;

        int min = badIdx;

        if (lIdx < size && badHeap.minHeap[lIdx] < badHeap.minHeap[badIdx])
            min = lIdx;

        if (rIdx < size && badHeap.minHeap[rIdx] < badHeap.minHeap[min])
            min = rIdx;

        if (min != badIdx) {
            swap(badHeap.minHeap, badIdx, min);
            heapify(badHeap, min);
        }

    }

    static void decreaseKey(MinHeap heap, int idx, int key) {

        heap.minHeap[idx] = key;

        int pIdx = heap.parent(idx);

        if (heap.minHeap[pIdx] > heap.minHeap[idx] && idx != 0) {
            swap(heap.minHeap, idx, pIdx);
            decreaseKey(heap, pIdx, key);
        }

    }

    static void swap(int[] arr, int idx1, int idx2) {
        int temp;
        temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {

        MinHeap heap = MinHeap.createBadHeap1();

        System.out.println(heap);

        heapify(heap, 0);

        System.out.println("After heapification");
        System.out.println(heap);
    }


}
