package sort.concepts;

public class Inversions {

    public static void main(String[] args) {
        // int[] arr = { 2, 4, 1, 3, 5 };

        int[] arr = { 4, 3, 2, 1 };

        System.out.println(inversions(arr, 0, arr.length - 1));

    }

    static int inversions(int[] arr, int low, int high) {

        int res = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            res += inversions(arr, low, mid);
            res += inversions(arr, mid + 1, high);
            res += countInvAndSort(arr, low, mid, high);
        }

        return res;
    }

    static int countInvAndSort(int[] arr, int low, int mid, int high) {

        int length1 = mid - low + 1;
        int length2 = high - mid;

        int[] first = new int[length1];
        int[] second = new int[length2];

        for (int i = 0; i < length1; i++) {
            first[i] = arr[low + i];
        }
        for (int i = 0; i < length2; i++) {
            second[i] = arr[mid + 1 + i];
        }

        // 2, 4, 1, 3, 5
        int i = 0;
        int j = 0;
        int main_index = low;

        int res = 0;

        while (i < length1 && j < length2) {
            if (first[i] <= second[j]) {
                arr[main_index++] = first[i++];
            } else if (first[i] > second[j]) {
                arr[main_index++] = second[j++];
                res += length1 - i;
            }
        }

        while (i < length1) {
            arr[main_index++] = first[i++];
        }
        while (j < length2) {
            arr[main_index++] = second[j++];
        }

        return res;
    }

}
