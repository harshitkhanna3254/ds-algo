package linkedlist;

public class InsertInSinglySorted {
    public static void main(String[] args) {
        Node head;

        head = Node.createSinglyLinkedList();
        Node.print(head);

        head = insertInSorted(head, 25);
        Node.print(head);
    }

    public static Node insertInSorted(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null)
            return newNode;

        if (head.data > data) {
            newNode.next = head;
            return newNode;
        }

        Node curr = head;

        while (curr.next != null && curr.next.data < data) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }
}
