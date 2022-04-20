package queue;

public class QueueLinkedList {

    Node head;
    Node rear;
    int size;

    QueueLinkedList() {
        head = null;
        rear = null;
        size = 0;
    }

    void enqueue(int data) {

        Node newNode = new Node(data);
        if (isEmpty(this)) {
            System.out.println("Inserting the first item in queue ..");
            head = newNode;
            rear = newNode;
            size++;
            return;
        }

        rear.next = newNode;
        rear = newNode;
        size++;
    }

    int dequeue() {
        if (isEmpty(this)) {
            System.out.println("Queue is Empty ..");
            return Integer.MIN_VALUE;
        }

        int removedItem = head.data;
        head = head.next;
        size--;

        // same as isEmpty()
        if (head == null) {
            rear = null;
        }
        return removedItem;
    }

    boolean isEmpty(QueueLinkedList queue) {
        return queue.size == 0;
    }

}

class TestLLQueue {
    public static void main(String[] args) {
        QueueLinkedList queueLinkedList = new QueueLinkedList();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
