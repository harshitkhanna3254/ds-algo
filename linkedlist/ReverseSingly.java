package linkedlist;

public class ReverseSingly {
    public static void main(String[] args) {

        Node head = Node.createSinglyLinkedList();
        Node.print(head);

        head = reverseIterative(head);
        Node.print(head);

        Node head1 = new Node(100);
        Node.print(head1);
        head1 = reverseIterative(head1);
        Node.print(head1);
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

    // public static Node reverseRecursiveV1(Node head) {

    //     if (head.next.next == null)
    //         return head;

    //     reverseIterative(head.next);

    //     Node curr = head.next;
    //     Node prev = head;
    //     Node next = curr.next;

    //     curr.next = prev;


    // }

}
