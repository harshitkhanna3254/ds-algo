package linkedlist;

public class FloydCycleDetection {
    public static void main(String[] args) {
        Node head = Node.createSinglyLinkedList();

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head.next.next;

        boolean hasLoop = detectLoop(head);
        System.out.println(hasLoop);
    }

    public static boolean detectLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
