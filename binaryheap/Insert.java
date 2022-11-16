package binaryheap;

public class Insert {

    static MinHeap insert(MinHeap heap, int data) {

        heap.size++;
        heap.minHeap[heap.size - 1] = data;

        int parentIdx = heap.parent(heap.size-1);
        int parentData = heap.minHeap[parentIdx];
        int currentIdx = heap.size - 1;

        while (parentData > data && currentIdx != 0) {
            swap(heap.minHeap, parentIdx, currentIdx);
            currentIdx = parentIdx;
            parentIdx = heap.parent(currentIdx);
            parentData = heap.minHeap[parentIdx];
        }

//                    10
//          20                    15
//     40         50        100         25
//  45     13

        return heap;
    }

    static void swap(int[] arr, int idx1, int idx2) {
        int temp;
        temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        MinHeap heap = MinHeap.createBasicHeap();

        insert(heap, 12);

        System.out.println(heap);
    }

}
