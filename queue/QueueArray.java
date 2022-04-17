package queue;

public class QueueArray {
    int capacity;
    int[] arr;
    int size;
    int front;
    int rear;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        front = 0;
        size = 0;
        rear = capacity - 1;
        arr = new int[this.capacity];
    }

    public boolean isFull(QueueArray queue) {
        return queue.size == queue.capacity;
    }

    public boolean isEmpty(QueueArray queue) {
        return queue.size == 0;
    }

    public void enqueue(int data) {
        if (isFull(this)) {
            System.out.println("Queue full");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
        System.out.println(data
                + " enqueued to queue");
    }

    public int dequeue() {
        if (isEmpty(this)) {
            System.out.println("Queue empty");
            return Integer.MIN_VALUE;
        }

        int item = arr[front];
        front = (front + 1) % capacity;
        this.size = size - 1;

        return item;
    }

    int front() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.arr[this.front];
    }

    int rear() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.arr[this.rear];
    }

}

class TestQueue {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(1000);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue()
                + " dequeued from queue\n");

        System.out.println("Front item is "
                + queue.front());

        System.out.println("Rear item is "
                + queue.rear());
    }
}
