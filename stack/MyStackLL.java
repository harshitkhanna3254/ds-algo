package stack;

public class MyStackLL {

    Node head;

    MyStackLL() {

    }

    void push(int data) {
        if (head == null) {
            head = new Node();
            head.data = data;
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
        }
    }
}

class TestStack {
    public static void main(String[] args) {
        MyStackLL myStackLL = new MyStackLL();
        myStackLL.push(10);
    }
}

class Node {
    int data;
    Node next;

    Node() {

    }

    Node(int data) {
        this.data = data;
    }
}
