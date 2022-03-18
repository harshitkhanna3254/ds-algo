package linkedlist;

public class CheckPalindrome {
    public static void main(String[] args) {
        Node n = new Node();
        Node head = n.createSinglyLinkedList(10, 20, 30, 30, 20, 10);

        Node.print(head);

        Boolean b = checkP(head);
        System.out.println("Palindrome : " + b);
    }

    public static Boolean checkP(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node reverse_head = reverseList(slow.next);

        while (reverse_head != null) {
            if (head.data != reverse_head.data)
                return false;
            reverse_head = reverse_head.next;
            head = head.next;
        }

        return true;
    }

    public static Node reverseList(Node head) {

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
}
