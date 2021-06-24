package search;

public class RepeatingElements {
    public static void main(String[] args) {

        // 2 problems. One has min element 0. Another has min element 1.
        // Little change in the logic for both.

        int[] arr1 = { 0, 2, 1, 3, 5, 4, 6, 2 };

        int[] arr2 = { 1, 3, 2, 4, 6, 5, 7, 3 };

        System.out.println(repeatingElementZero(arr1));

        System.out.println(repeatingElementOne(arr2));

    }

    static int repeatingElementZero(int[] arr) {

        int slow = arr[0] + 1;
        int fast = arr[0] + 1;

        do {
            slow = arr[slow] + 1;
            fast = arr[arr[fast] + 1] + 1;
        } while (slow != fast);

        slow = arr[0] + 1;

        while (slow != fast) {
            slow = arr[slow] + 1;
            fast = arr[fast] + 1;
        }

        return slow - 1;
    }

    static int repeatingElementOne(int[] arr) {

        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        slow = arr[0];

        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }

}
