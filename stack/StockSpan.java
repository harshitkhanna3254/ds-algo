package stack;

import java.util.ArrayDeque;

public class StockSpan {
    public static void main(String[] args) {
        int[] input_arr1 = { 60, 10, 20, 15, 35, 50 };
        int[] input_arr2 = { 30, 20, 25, 28, 27, 29 };

        stockSpan(input_arr2);
    }

    public static void stockSpan(int[] input_arr) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(0);

        System.out.print(1 + " ");

        for (int i = 1; i < input_arr.length; i++) {
            while (!arrayDeque.isEmpty() && input_arr[i] >= input_arr[arrayDeque.peek()]) {
                arrayDeque.pop();
            }

            int span = arrayDeque.isEmpty() ? (i + 1) : i - arrayDeque.peek();
            System.out.print(span + " ");
            arrayDeque.push(i);
        }

    }
}
