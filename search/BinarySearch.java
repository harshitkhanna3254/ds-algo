package search;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr1 = { 2, 4, 6, 7, 10, 23, 24, 25, 26, 27, 46, 78, 97, 98 };

        int[] arr2 = { 5, 15, 25 };

        int[] arr3 = { 5, 10, 15, 30 };

        int[] arr4 = { 10, 15 };

        int[] arr5 = { 10, 10 };

        int x = 10;

        System.out.println(binaryIterative(arr5, x));
        System.out.println(binaryRecursive(arr5, x, 0, arr5.length - 1));

    }

    static boolean binaryIterative(int[] arr, int x) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == x)
                return true;

            if (x > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }

    static boolean binaryRecursive(int[] arr, int x, int start, int end) {

        if (start > end)
            return false;

        int mid = (start + end) / 2;

        if (arr[mid] == x)
            return true;

        if (arr[mid] > x)
            return binaryRecursive(arr, x, mid + 1, end);
        else
            return binaryRecursive(arr, x, start, mid - 1);

    }

}
