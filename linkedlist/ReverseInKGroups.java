package linkedlist;

public class ReverseInKGroups {
    public static void main(String[] args) {
        Node head = Node.createSinglyLinkedList();
        Node.print(head);

        head = reverseK(head, 3);
        Node.print(head);
    }

    public static Node reverseK(Node head, int k) {

        Node curr = head;
        Node prev = null;
        Node next = null;

        for (int i = 0; i < k && curr != null; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        if (next != null) {
            Node restHead = reverseK(curr, k);
            head.next = restHead;
        }

        return prev;
    }

    public static Node reverse(Node head, int k) {

        Node curr = head;
        Node prev = null;

        for (int i = 0; i < k && curr != null; i++) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
