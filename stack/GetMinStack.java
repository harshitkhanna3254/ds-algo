package stack;

import java.util.ArrayDeque;

public class GetMinStack {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        s.pop();
        System.out.print(" Minimum Element from Stack: " + s.getMin());

        MyStackPositive myStackPositive = new MyStackPositive();
        myStackPositive.push(4);
        myStackPositive.push(5);
        myStackPositive.push(8);
        myStackPositive.push(1);
        myStackPositive.pop();

        System.out.print("\n Minimum Element from Stack (All Positives): " + myStackPositive.getMin());
    }
}

class MyStack {
    ArrayDeque<Integer> ms;
    ArrayDeque<Integer> as;

    MyStack() {
        ms = new ArrayDeque<>();
        as = new ArrayDeque<>();
    }

    void push(int data) {
        ms.push(data);

        if (as.isEmpty())
            as.push(data);

        if (as.peek() >= ms.peek()) {
            as.push(data);
        }
    }

    void pop() {
        int removed_item = ms.pop();

        if (removed_item == as.peek()) {
            as.pop();
        }
    }

    int getMin() {
        return as.peek();
    }

}

class MyStackPositive {
    ArrayDeque<Integer> stack;
    private int min;

    MyStackPositive() {
        stack = new ArrayDeque<>();
    }

    void push(int data) {

        if (stack.isEmpty()) {
            stack.push(data);
            min = data;
        } else if (min >= data) {
            stack.push(data - min);
            min = data;
        } else {
            stack.push(data);
        }
    }

    int pop() {
        int removed_item = stack.pop();
        int previos_min = min;

        if (removed_item < 0) {
            min = min - removed_item;
        }

        return previos_min;
    }

    int getMin() {
        return min;
    }

}
