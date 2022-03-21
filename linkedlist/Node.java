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

    public Node createSinglyLinkedList(int a, int b, int c, int d) {
        Node head = new Node(a);
        Node node2 = new Node(b);
        Node node3 = new Node(c);
        Node node4 = new Node(d);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        return head;
    }

    public Node createSinglyLinkedList(int a, int b, int c, int d, int e) {
        Node head = new Node(a);
        Node node2 = new Node(b);
        Node node3 = new Node(c);
        Node node4 = new Node(d);
        Node node5 = new Node(e);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        return head;
    }

    public Node createSinglyLinkedList(int a, int b, int c, int d, int e, int f) {
        Node head = new Node(a);
        Node node2 = new Node(b);
        Node node3 = new Node(c);
        Node node4 = new Node(d);
        Node node5 = new Node(e);
        Node node6 = new Node(f);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        return head;
    }

    public static Node createSinglyLinkedList(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j,
            int k) {
        Node head = new Node(a);
        Node node2 = new Node(b);
        Node node3 = new Node(c);
        Node node4 = new Node(d);
        Node node5 = new Node(e);
        Node node6 = new Node(f);
        Node node7 = new Node(g);
        Node node8 = new Node(h);
        Node node9 = new Node(i);
        Node node10 = new Node(j);
        Node node11 = new Node(k);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;

        return head;
    }

}
