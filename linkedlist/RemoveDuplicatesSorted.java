package linkedlist;

public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        Node head = Node.createSinglyLinkedList(10, 20, 20, 30, 40, 50, 50, 50, 60, 70, 70);
        Node.print(head);

        head = removeDup(head);
        Node.print(head);
    }

    public static Node removeDup(Node head) {

        Node curr = head;

        while (curr != null && curr.next != null) {
            if (curr.next.data == curr.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }

}
