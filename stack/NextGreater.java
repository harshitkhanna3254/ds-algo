package stack;

import java.util.ArrayDeque;

public class NextGreater {
    public static void main(String[] args) {
        int[] input_arr1 = { 15, 10, 18, 12, 4, 6, 2, 8 };
        int[] input_arr2 = { 8, 10, 12 };
        int[] input_arr3 = { 12, 10, 8 };

        printNextGreater(input_arr1);
    }

    public static void printNextGreater(int[] input_arr) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(input_arr[0]);
        System.out.print("-1");

        for (int i = 1; i < input_arr.length; i++) {
            while (!stack.isEmpty() && input_arr[i] >= stack.peek()) {
                stack.pop();
            }

            int prev_greater = stack.isEmpty() ? -1 : stack.peek();
            System.out.print(" " + prev_greater);
            stack.push(input_arr[i]);
        }

    }
}
