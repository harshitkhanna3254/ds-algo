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

        Node head = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        head.next = node2;
        node2.next = node3;

        print(head);
        head = insertBegin(head, 5);
        print(head);
        head = insertEnd(head, 40);
        print(head);
    }

    public static Node insertEnd(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

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
