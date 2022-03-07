package linkedlist;

public class ReverseSingly {
    public static void main(String[] args) {

        Node head = Node.createSinglyLinkedList();
        // Node.print(head);

        head = reverseRecursiveV2(head, null);
        Node.print(head);

        // Node head1 = new Node(100);
        // // Node.print(head1);
        // head1 = reverseRecursiveV1(head1);
        // Node.print(head1);
    }

    public static Node reverseIterative(Node head) {

        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static Node reverseRecursiveV1(Node head) {

        if (head == null || head.next == null)
            return head;

        Node tail = reverseRecursiveV1(head.next);

        Node next = head.next;
        head.next = next.next;
        next.next = head;

        return tail;
    }

    public static Node reverseRecursiveV2(Node head, Node temp) {

        if (head == null)
            return temp;

        Node next = head.next;
        head.next = temp;

        return reverseRecursiveV2(next, head);
    }

}
