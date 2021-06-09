package arrays;

public class MajorityElement {
    public static void main(String[] args) {

        int[] arr = { 6, 8, 4, 8, 8 };

        int[] arr1 = { 8, 8, 6, 6, 6, 4, 6 };

        System.out.println("Majority element is at index " + majority(arr1));

    }

    static int majority(int[] arr) {

        int res = 0;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[res]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                res = i;
                count = 1;
            }
        }

        System.out.println("Candidate is " + arr[res] + " at index " + res);
        System.out.println("Checking if candidate is majority ..... ");

        // check if candidate if majority element
        int count_final = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[res]) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return res;
        }
        return -1;
    }
}
