package linkedlist;

public class MergeSortedLL {
    public static void main(String[] args) {

        Node n = new Node();

        Node head1 = n.createSinglyLinkedList(10, 20, 30, 40);
        Node head2 = n.createSinglyLinkedList(5, 15, 17, 18, 35);

        Node mergedHead = mergeLL(head1, head2);
        Node.print(mergedHead);

        System.out.println("Henloo");
    }

    public static Node mergeLL(Node a, Node b) {

        if (a == null)
            return b;
        if (b == null)
            return a;
        Node head = null, tail = null;
        if (a.data <= b.data) {
            head = tail = a;
            a = a.next;
        } else {
            head = tail = b;
            b = b.next;
        }
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                tail = a;
                a = a.next;
            } else {
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }
        return head;
    }

}
