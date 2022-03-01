package linkedlist;

class DoubleNode {
    int data;
    DoubleNode next;
    DoubleNode prev;

    DoubleNode(int data) {
        this.data = data;
    }
}

public class DoublyLinkedList {

    public static void main(String[] args) {

        DoubleNode head = new DoubleNode(10);
        DoubleNode node2 = new DoubleNode(20);
        DoubleNode node3 = new DoubleNode(30);

        head.next = node2;
        node2.prev = head;
        node2.next = node3;
        node3.prev = node2;

        print(head);
        head = insertBegin(head, 1);
        print(head);
        head = insertEnd(head, 40);
        print(head);
        System.out.println("reversing");
        head = reverse(head);
        print(head);
        head = deleteHead(head);
        print(head);
        head = deleteLast(head);
        print(head);
    }

    public static DoubleNode deleteLast(DoubleNode head) {
        if (head == null || head.next == null)
            return null;

        DoubleNode temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next.prev = null;
        temp.next = null;

        return head;
    }

    public static DoubleNode deleteHead(DoubleNode head) {

        if (head == null || head.next == null)
            return null;

        DoubleNode temp = head.next;

        head.next = null;
        temp.prev = null;

        return temp;
    }

    public static void print(DoubleNode head) {
        DoubleNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static DoubleNode insertBegin(DoubleNode head, int data) {

        DoubleNode newNode = new DoubleNode(data);

        if (head == null) {
            return newNode;
        }

        newNode.next = head;
        head.prev = newNode;

        return newNode;
    }

    public static DoubleNode insertEnd(DoubleNode head, int data) {

        DoubleNode newNode = new DoubleNode(data);

        if (head == null) {
            return newNode;
        }

        DoubleNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    public static DoubleNode reverse(DoubleNode head) {

        if (head == null || head.next == null)
            return head;

        DoubleNode curr = head;
        DoubleNode prev = null;

        while (curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }

        return prev.prev;
    }
}
