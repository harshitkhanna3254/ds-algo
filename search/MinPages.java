package search;

public class MinPages {
    public static void main(String[] args) {

        // int[] arr1 = { 2, 4, 6, 7, 10, 23, 24, 25, 26, 27, 46, 78, 97, 98 };

        int[] arr1 = { 10, 20, 30, 40 };

        int k = 2;

        System.out.println(minPages(arr1, k));

        // System.out.println(allocateStudents(arr1, 50));

    }

    static int minPages(int[] arr, int k) {

        int max_ele = arr[0];
        int total_sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max_ele = Math.max(arr[i], max_ele);
            total_sum += arr[i];
        }

        int start = max_ele;
        int end = total_sum;

        int res = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (allocateStudents(arr, mid, k)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return res;
    }

    static boolean allocateStudents(int[] arr, int mid, int k) {

        int students = 1;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > mid) {
                students++;
                sum = arr[i];
            }
        }

        return students <= k;
    }
}
