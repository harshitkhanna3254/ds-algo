package stack;

public class TwoStacks {

    int[] arr;
    int top1;
    int top2;
    int capacity;

    TwoStacks(int capacity) {
        arr = new int[capacity];
        top1 = -1;
        top2 = capacity;
        this.capacity = capacity;
    }

    void push1(int data) {
        if (top1 + 1 == top2) {
            System.out.println("Stacks full");
            return;
        }

        top1++;
        arr[top1] = data;
        System.out.println("Pushed " + data + " to S1");
    }

    void push2(int data) {
        if (top2 - 1 == top1) {
            System.out.println("Stacks full");
            return;
        }

        top2--;
        arr[top2] = data;
        System.out.println("Pushed " + data + " to S2");
    }

}

class TestTwoStacks {
    public static void main(String[] args) {
        TwoStacks twoStacks = new TwoStacks(7);

        twoStacks.push1(10);
        twoStacks.push2(10);
        twoStacks.push1(10);
        twoStacks.push1(10);
        twoStacks.push1(10);
        twoStacks.push2(10);
        twoStacks.push2(10);
        twoStacks.push2(10);
        twoStacks.push1(10);
    }

}
