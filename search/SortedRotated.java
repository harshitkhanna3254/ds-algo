package search;

public class SortedRotated {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 40, 60, 5, 8 };
        int x = 5;

        System.out.println(searchElement(arr, x));

    }

    static int searchElement(int[] arr, int x) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[low] < arr[mid]) {
                if (arr[low] < x && arr[mid] > x)
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (arr[high] > x && arr[mid] < x)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }
}
