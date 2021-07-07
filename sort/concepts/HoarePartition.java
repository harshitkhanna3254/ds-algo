package sort.concepts;

public class HoarePartition {
    public static void main(String[] args) {
        int[] arr = { 5, 5, 5, 5 };
        // int[] arr = { 5, 3, 6, 4, 2, 7, 1, 10 };
        int low = 0;
        int high = arr.length - 1;

        System.out.println(hoare(arr, low, high));

    }

    static int hoare(int[] arr, int low, int high) {

        int i = low - 1;
        int j = high + 1;
        int pivot = arr[low];

        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j)
                return j;

            swap(arr, i, j);
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
