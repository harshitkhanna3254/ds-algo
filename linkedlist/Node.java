package linkedlist;

public class Node {
    int data;
    Node next;

    Node() {
    }

    Node(int data) {
        this.data = data;
        next = null;
    }

    public static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node createSinglyLinkedList() {
        Node head = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        return head;
    }

}
