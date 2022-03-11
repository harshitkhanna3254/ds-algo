package linkedlist;

public class RemoveLoop {
    public static void main(String[] args) {
        Node head = Node.createSinglyLinkedList();

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head.next.next;

        head = removeLoop(head);
        Node.print(head);
    }

    public static Node removeLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (slow != fast) {
            System.out.println("No loop found");
            return head;
        }

        slow = head;

        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = null;

        return head;
    }
}
