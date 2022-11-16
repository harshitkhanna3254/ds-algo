package binaryheap;

import java.util.Arrays;

public class MaxHeapOperations {

    private static void insert(MaxHeap maxHeap, int data) {
        if (maxHeap.capacity == maxHeap.size) {
            System.out.println("MaxHeap capacity is full. Delete an element before inserting.");
            return;
        }

        maxHeap.size++;
        maxHeap.maxHeap[maxHeap.size - 1] = data;

        int currentNodeIdx = maxHeap.size - 1;

        int parentNodeIdx = maxHeap.parent(maxHeap.size - 1);
        int parentNode = maxHeap.maxHeap[parentNodeIdx];

        while (data > parentNode && currentNodeIdx != 0) {
            swap(maxHeap.maxHeap, currentNodeIdx, parentNodeIdx);
            currentNodeIdx = parentNodeIdx;

            parentNodeIdx = maxHeap.parent(currentNodeIdx);
            parentNode = maxHeap.maxHeap[parentNodeIdx];
        }

    }

    private static void maxHeapify(MaxHeap maxHeap, int badIndex) {

    }

    static MaxHeap buildMaxHeapFromArray(int[] arr) {

        MaxHeap maxHeap = new MaxHeap(arr.length);


        System.out.println(Arrays.toString(arr));

        return maxHeap;

    }

    private static void swap(int[] arr, int idx1, int idx2) {
        int temp;
        temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = MaxHeap.createBasicMaxHeap2();
        System.out.println(maxHeap);

        insert(maxHeap, 150);
        System.out.println("After inserting 150");
        System.out.println(maxHeap);
    }


}
