package linkedlist;

import java.util.HashMap;

class NodeRandom {
    int data;
    NodeRandom next, random;

    NodeRandom(int x) {
        data = x;
        next = random = null;
    }
}

public class CloneLLWithRandomPinter {
    public static void main(String[] args) {
        NodeRandom head = new NodeRandom(10);
        head.next = new NodeRandom(5);
        head.next.next = new NodeRandom(20);
        head.next.next.next = new NodeRandom(15);
        head.next.next.next.next = new NodeRandom(20);

        head.random = head.next.next;
        head.next.random = head.next.next.next;
        head.next.next.random = head;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head.next.next.next;

        System.out.print("Original list : \n");
        print(head);

        System.out.print("\nCloned list : \n");
        NodeRandom cloned_list = clone(head);
        print(cloned_list);
    }

    public static NodeRandom clone(NodeRandom head) {

        HashMap<NodeRandom, NodeRandom> hashMap = new HashMap<>();

        NodeRandom cloneList = null;

        for (NodeRandom curr = head; curr != null; curr = curr.next) {
            hashMap.put(curr, new NodeRandom(curr.data));
        }

        for (NodeRandom curr = head; curr != null; curr = curr.next) {
            cloneList = hashMap.get(curr);
            cloneList.next = hashMap.get(curr.next);
            cloneList.random = hashMap.get(curr.random);
        }

        NodeRandom head2 = hashMap.get(head);

        return head2;
    }

    public static void print(NodeRandom head) {
        NodeRandom temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
