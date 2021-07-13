package sort.concepts;

import java.util.Arrays;

public class MeetingMaximumGuests {
    public static void main(String[] args) {
        int[] arr1 = { 800, 700, 600, 500 };
        int[] arr2 = { 840, 820, 830, 530 };

        int res = maxGuests(arr1, arr2);

        System.out.println(res);
    }

    static int maxGuests(int arr1[], int[] arr2) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = 1;
        int j = 0;
        int res = 1;
        int count = 1;

        while (i < n1 && j < n2) {

            if (arr1[i] < arr2[j]) {
                count++;
                i++;
            } else {
                count--;
                j++;
            }

            res = Math.max(res, count);
        }

        return res;
    }
}
