package search;

public class FirstOccurance {
    public static void main(String[] args) {

        // int[] arr1 = { 2, 4, 6, 7, 10, 23, 24, 25, 26, 27, 46, 78, 97, 98 };

        int[] arr2 = { 5, 10, 10, 15, 20, 20, 20 };

        int x = 20;

        System.out.println(binaryRecursive(arr2, x, 0, arr2.length - 1));

    }

    static int binaryRecursive(int[] arr, int x, int start, int end) {

        if (start > end)
            return -1;

        int mid = (start + end) / 2;

        if (arr[mid] == x) {

            if (mid == 0)
                return mid;

            if (arr[mid - 1] != x) {
                return mid;
            } else {
                binaryRecursive(arr, x, start, mid - 1);
            }

        }

        if (x > arr[mid])
            return binaryRecursive(arr, x, mid + 1, end);
        else
            return binaryRecursive(arr, x, start, mid - 1);

    }

}
