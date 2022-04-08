package stack;

import java.util.ArrayDeque;
import java.util.Arrays;

public class LargestRectangularAreaHistogram {
    public static void main(String[] args) {
        int[] input_arr1 = { 6, 2, 5, 4, 1, 5, 6 };
        int[] input_arr2 = { 2, 5, 1 };
        int[] input_arr3 = { 12, 10, 8 };

        int largestArea = largestRecArea(input_arr1);
        System.out.println("Largest rec area is :" + largestArea);
    }

    public static int largestRecArea(int[] input_arr) {

        int[] previous_smaller_arr = previousSmaller(input_arr);
        int[] next_smaller_arr = nextSmaller(input_arr);

        System.out.println(Arrays.toString(previous_smaller_arr));
        System.out.println(Arrays.toString(next_smaller_arr));

        int result = 0;

        for (int i = 0; i < input_arr.length; i++) {
            int curr = input_arr[i];
            curr += (i - previous_smaller_arr[i] - 1) * input_arr[i];
            curr += (next_smaller_arr[i] - i - 1) * input_arr[i];

            result = Math.max(result, curr);
        }

        return result;
    }

    public static int[] previousSmaller(int[] input_arr) {

        int[] previous_smaller_arr = new int[input_arr.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(0);
        previous_smaller_arr[0] = -1;

        for (int i = 1; i < input_arr.length; i++) {
            while (!stack.isEmpty() && input_arr[stack.peek()] > input_arr[i]) {
                stack.pop();
            }

            int previousSmallerElement = stack.isEmpty() ? -1 : stack.peek();
            previous_smaller_arr[i] = previousSmallerElement;
            stack.push(i);
        }

        return previous_smaller_arr;
    }

    public static int[] nextSmaller(int[] input_arr) {

        int[] next_smaller_arr = new int[input_arr.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int n = input_arr.length;

        stack.push(n - 1);
        next_smaller_arr[n - 1] = n;

        for (int i = n - 2; i >= 0; i--) {
            while (!stack.isEmpty() && input_arr[stack.peek()] > input_arr[i]) {
                stack.pop();
            }

            int nextSmallerElement = stack.isEmpty() ? n : stack.peek();
            next_smaller_arr[i] = nextSmallerElement;
            stack.push(i);
        }

        return next_smaller_arr;
    }

}
