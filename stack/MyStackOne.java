package stack;

import java.util.ArrayList;

public class MyStackOne {

    ArrayList<Integer> al;
    int[] stack;

    MyStackOne(int capacity) {
        al = new ArrayList<>();
    }

    void push(int data) {
        al.add(data);
    }

    int pop() {
        return al.remove(al.size() - 1);
    }

    int peek() {
        return al.get(al.size() - 1);
    }

}

class TestStack {
    public static void main(String[] args) {
        MyStackOne s = new MyStackOne(10);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        s.push(30);
        System.out.println(s.pop());

    }
}
