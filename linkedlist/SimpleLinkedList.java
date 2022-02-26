package linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SimpleLinkedList {

    public static void main(String[] args) {

        Node head = new Node(20);
        Node node2 = new Node(25);
        Node node3 = new Node(30);

        head.next = node2;
        node2.next = node3;

        print(head);
        head = insertBegin(head, 15);
        head = insertBegin(head, 10);
        head = insertBegin(head, 5);
        print(head);
        head = insertEnd(head, 35);
        head = insertEnd(head, 40);
        head = insertEnd(head, 45);
        print(head);
        head = deleteFirst(head);
        print(head);
        head = deleteLast(head);
        print(head);
        head = insertAtPosition(head, 5, 1);
        print(head);
        head = insertAtPosition(head, 5, 14);
        print(head);
        System.out.println("Value 40 found at position: " + searchRecursive(head, 40, 1));
        System.out.println("Value 10 found at position: " + searchRecursive(head, 10, 1));
        System.out.println("Value 70 not found " + searchRecursive(head, 700, 1));

    }

    public static int searchRecursive(Node head, int data, int position) {

        if (head == null) {
            return -1;
        }

        if (head.data == data) {
            return position;
        }

        return searchRecursive(head.next, data, position + 1);
    }

    // position 2 = index 1
    public static Node insertAtPosition(Node head, int data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            return newNode;
        }

        Node curr = head;

        int i = 1;
        while (i != position - 1 && curr != null) {
            curr = curr.next;
            i++;
        }

        if (curr == null) {
            System.out.println("bad position");
            return head;
        }

        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    public static Node deleteLast(Node head) {
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    public static Node deleteFirst(Node head) {
        Node temp = head;
        head = head.next;
        temp.next = null;

        return head;
    }

    public static Node insertEnd(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    public static Node insertBegin(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        return head;
    }

    public static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
