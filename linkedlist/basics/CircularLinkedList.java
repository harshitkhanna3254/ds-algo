package linkedlist.basics;

class CircularNode {
    int data;
    CircularNode next;

    CircularNode(int data) {
        this.data = data;
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        CircularNode head = new CircularNode(10);
        CircularNode node2 = new CircularNode(20);
        CircularNode node3 = new CircularNode(30);
        CircularNode node4 = new CircularNode(40);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = head;

        printList(head);
        head = insertBegin(head, 7);
        printList(head);
        head = insertBegin(head, 4);
        printList(head);
        head = insertBegin(head, 1);
        printList(head);

        // random(head);
        head = deleteKthNode(head, 4);
        printList(head);
    }

    public static CircularNode deleteKthNode(CircularNode head, int k) {

        if (head == null)
            return null;

        CircularNode curr = head;

        System.out.println("Removing " + k + "th node");

        if (k == 1) {
            // deleteHead() function. This again can be made efficient to O(1) from O(n-1)
            if (head.next == head) {
                System.out.println("Only node deleted.");
                return null;
            } else {
                while (curr.next != head) {
                    curr = curr.next;
                }
                curr.next = curr.next.next;
                return curr.next;
            }
        }

        int i = 1;
        while (i < k - 1) {
            curr = curr.next;
            i++;
        }

        curr.next = curr.next.next;

        return head;
    }

    // There is an efficient approach too.
    // Add the node after the first node and swap the data of head and temp.
    public static CircularNode insertBegin(CircularNode head, int data) {

        CircularNode newnode = new CircularNode(data);

        if (head == null) {
            newnode.next = newnode;
            return newnode;
        }

        CircularNode curr = head;

        while (curr.next != head) {
            curr = curr.next;
        }

        curr.next = newnode;
        newnode.next = head;

        return newnode;
    }

    public static void printList(CircularNode head) {

        if (head == null)
            return;

        if (head.next == null) {
            System.out.println(head.data);
            return;
        }

        CircularNode curr = head;

        while (curr.next != head) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println(curr.data);
    }

    public static void random(CircularNode head) {
        for (int i = 0; i < 20; i++) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

}
