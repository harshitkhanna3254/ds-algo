package sort.concepts;

public class KthSmallest {
    public static void main(String[] args) {

        int[] arr = { 8, 4, 7, 9, 3, 10, 5 };

        int[] arr1 = { 20, 5, 40, 60, 10, 30 };

        int[] arr2 = { 10, 4, 5, 8, 11, 6, 26 };

        int k = 5;

        int kthSmallest = kthSmallestBetter(arr2, 0, 6, k);
        System.out.println(kthSmallest);

        // int kthSmallest = kthSmallest(arr, 0, 6, k);
        // System.out.println(kthSmallest);

    }

    /* -------------------------------------------------------------------------- */
    /* QuickSelect Algorithm */
    /* -------------------------------------------------------------------------- */

    static int kthSmallestBetter(int[] arr, int low, int high, int k) {
        int j = 0;
        int r = high - 1;

        while (j <= r - 1) {
            int partitionIndex = lomuto(arr, j, r);

            if (partitionIndex == k - 1)
                return arr[partitionIndex];

            else if (partitionIndex > k - 1) {
                r = partitionIndex - 1;
            } else {
                j = partitionIndex + 1;
            }
        }

        return -1;
    }

    static int kthSmallest(int[] arr, int low, int high, int k) {
        if (low < high) {
            int partitionIndex = lomuto(arr, low, high);

            if (k - 1 == partitionIndex)
                return arr[partitionIndex];

            if (k - 1 < partitionIndex) {
                return kthSmallest(arr, low, partitionIndex - 1, k);
            } else {
                return kthSmallest(arr, partitionIndex + 1, high, k);
            }
        }
        return -1;
    }

    static int lomuto(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < arr.length - 1; j++) {
            if (arr[j] < pivot)
                swap(arr, ++i, j);
        }

        swap(arr, ++i, high);

        return i;

    }

    static int[] swap(int[] arr, int x, int y) {

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

        return arr;
    }
}
