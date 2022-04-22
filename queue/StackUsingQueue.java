package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int size;

    StackUsingQueue() {
        q1 = new ArrayDeque<Integer>();
        q2 = new ArrayDeque<Integer>();
    }

    void push(int data) {
        q1.add(data);
        size++;
    }

    int pop() {

        if (q1.isEmpty()) {
            return Integer.MIN_VALUE;
        }

        while (q1.size() != 1) {
            q2.add(q1.remove());
        }
        int item = q1.remove();
        size--;
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }

        return item;
    }

    int top() {
        if (q1.isEmpty()) {
            return Integer.MIN_VALUE;
        }

        int count = 0;
        for (int x : q1) {
            if (count == q1.size() - 1) {
                return x;
            }
            count++;
        }
        return Integer.MIN_VALUE;
    }

    int size() {
        return size;
    }

}

class TestStackusingQueue {

    public static void main(String[] args) {
        StackUsingQueue stackUsingQueue = new StackUsingQueue();

        stackUsingQueue.push(5);
        stackUsingQueue.push(10);
        stackUsingQueue.push(15);
        stackUsingQueue.push(20);

        System.out.println("current size: " + stackUsingQueue.size());
        System.out.println(stackUsingQueue.top());
        stackUsingQueue.pop();
        System.out.println(stackUsingQueue.top());
        stackUsingQueue.pop();
        System.out.println(stackUsingQueue.top());
        stackUsingQueue.pop();
        System.out.println(stackUsingQueue.top());
        stackUsingQueue.pop();
        System.out.println(stackUsingQueue.top());
        stackUsingQueue.pop();
        System.out.println(stackUsingQueue.top());

        System.out.println("current size: " + stackUsingQueue.size());

    }
}
