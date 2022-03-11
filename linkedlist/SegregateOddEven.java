package linkedlist;

public class SegregateOddEven {
    public static void main(String[] args) {
        Node head = Node.createSinglyLinkedList(1, 2, 2, 3, 4, 5, 5, 5, 6, 7, 7);
        Node.print(head);

        head = segregateOddEven(head);
        Node.print(head);
    }

    public static Node segregateOddEven(Node head) {

        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;

        Node curr = head;

        while (curr != null) {
            if (curr.data % 2 == 0) {
                if (evenStart == null) {
                    evenStart = curr;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = curr;
                    evenEnd = evenEnd.next;
                }
            } else {
                if (oddStart == null) {
                    oddStart = curr;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = curr;
                    oddEnd = oddEnd.next;
                }
            }
            curr = curr.next;
        }

        if (evenStart == null || oddStart == null) {
            return head;
        }

        evenEnd.next = oddStart;
        oddEnd.next = null;

        return evenStart;
    }
}
