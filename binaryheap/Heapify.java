package binaryheap;

public class Heapify {

    static void minHeapify(MinHeap badHeap, int n, int badIndex) {

        int leftChildIdx = badHeap.left(badIndex);
        int rightChildIdx = badHeap.right(badIndex);

        int smallest = badIndex;

        if (leftChildIdx < n && badHeap.minHeap[leftChildIdx] < badHeap.minHeap[badIndex])
            smallest = leftChildIdx;

        if (rightChildIdx < n && badHeap.minHeap[rightChildIdx] < badHeap.minHeap[smallest])
            smallest = rightChildIdx;

        if (smallest != badIndex) {
            swap(badHeap.minHeap, badIndex, smallest);
            minHeapify(badHeap, n, smallest);
        }

    }

    static void maxHeapify(MaxHeap heap, int n, int i) {
        int lcIdx = heap.left(i);
        int rcIdx = heap.right(i);

        int largest = i;

        if (lcIdx < n && heap.maxHeap[lcIdx] > heap.maxHeap[largest])
            largest = lcIdx;

        if (rcIdx < n && heap.maxHeap[rcIdx] > heap.maxHeap[largest])
            largest = rcIdx;

        if (largest != i) {
            swap(heap.maxHeap, largest, i);
            maxHeapify(heap, n, largest);
        }
    }

    static void swap(int[] arr, int idx1, int idx2) {
        int temp;
        temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        MinHeap badHeap = MinHeap.createBadHeap1();
        int badIndex = 0;
        System.out.println(badHeap);
        minHeapify(badHeap, badHeap.size, badIndex);
        System.out.println("After Min Heapification");
        System.out.println(badHeap);

        System.out.println("................................");

        MaxHeap badMHeap = MaxHeap.createBadMaxHeap1();
        System.out.println(badMHeap);
        maxHeapify(badMHeap, badMHeap.capacity, 0);
        System.out.println("After Max Heapification");
        System.out.println(badMHeap);
    }
}
