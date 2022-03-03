package linkedlist;

public class MiddleElement {
    public static void main(String[] args) {
        Node head;

        head = Node.createSinglyLinkedList();
        Node.print(head);

        System.out.println(middleElement(head));
    }

    public static int middleElement(Node head) {

        if (head == null)
            return -1;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
}
