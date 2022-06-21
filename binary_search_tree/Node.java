package binary_search_tree;

import java.util.LinkedList;

public class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }

    static Node generateSimpleBST() {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        return root;
    }

    public static void printBinaryTree(Node root) {
        LinkedList<Node> treeLevel = new LinkedList<Node>();
        treeLevel.add(root);
        LinkedList<Node> temp = new LinkedList<Node>();
        int counter = 0;
        int height = heightOfTree(root) - 1;
        // System.out.println(height);
        double numberOfElements = (Math.pow(2, (height + 1)) - 1);
        // System.out.println(numberOfElements);
        while (counter <= height) {
            Node removed = treeLevel.removeFirst();
            if (temp.isEmpty()) {
                printSpace(numberOfElements / Math.pow(2, counter + 1), removed);
            } else {
                printSpace(numberOfElements / Math.pow(2, counter), removed);
            }
            if (removed == null) {
                temp.add(null);
                temp.add(null);
            } else {
                temp.add(removed.left);
                temp.add(removed.right);
            }

            if (treeLevel.isEmpty()) {
                System.out.println("");
                System.out.println("");
                treeLevel = temp;
                temp = new LinkedList<>();
                counter++;
            }

        }

        System.out.println();
    }

    public static void printSpace(double n, Node removed) {
        for (; n > 0; n--) {
            System.out.print("\t");
        }
        if (removed == null) {
            System.out.print(" ");
        } else {
            System.out.print(removed.data);
        }
    }

    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
    }

}

class BSTTest {
    public static void main(String[] args) {
        Node root = Node.generateSimpleBST();

        // Node.printBinaryTree(root);

        // System.out.println("Inserting 11 \nInserting 17 \nDeleting 15");

        root = insert(root, 11);
        root = insertIterative(root, 17);
        delete(root, 15);

        Node.printBinaryTree(root);

        // System.out.println("11 is present? -> " + search(root, 11));
        // System.out.println("13 is present? -> " + search(root, 13));
        // System.out.println("15 is present? -> " + search(root, 15));

        int x = 4;
        Node floorRoot = findFloor(root, x);
        if (floorRoot != null)
            System.out.println("Floor of the node " + x + " is " + floorRoot.data);
        else
            System.out.println("Floor of the node " + x + " is null");

        int y = 18;
        Node ceilRoot = findCeil(root, y);
        if (ceilRoot != null)
            System.out.println("Ceil of the node " + y + " is " + ceilRoot.data);
        else
            System.out.println("Ceil of the node " + y + " is null");
    }

    static Node insert(Node root, int data) {

        if (root == null)
            return new Node(data);

        if (root.data > data) {
            root.left = insert(root.left, data);
        }

        else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    static Node insertIterative(Node root, int data) {
        Node temp = root;

        Node parent = null;

        while (temp != null) {
            if (temp.data == data) {
                return temp;
            }
            if (data < temp.data) {
                parent = temp;
                temp = temp.left;
            } else if (data > temp.data) {
                parent = temp;
                temp = temp.right;
            }
        }

        temp = new Node(data);

        if (parent.data < data) {
            parent.right = temp;
        } else {
            parent.left = temp;
        }

        return root;
    }

    static Boolean search(Node root, int data) {

        if (root == null)
            return false;

        if (root.data == data)
            return true;

        if (root.data > data)
            return search(root.left, data);

        else
            return search(root.right, data);
    }

    /*
     * Three cases.
     * zero child nodes (leaf node)
     * one child node
     * two child nodes
     */
    static Node delete(Node root, int data) {

        if (root == null)
            return root;

        if (root.data > data)
            root.left = delete(root.left, data);

        else if (root.data < data)
            root.right = delete(root.right, data);

        else {
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            int closestHighestSuccessorKey = getClosestHighestSuccessorKey(root);
            root.data = closestHighestSuccessorKey;
            root.right = delete(root.right, closestHighestSuccessorKey);
        }

        return root;
    }

    static Integer getClosestHighestSuccessorKey(Node root) {
        Node curr = root.right;

        while (curr.left != null) {
            curr = curr.left;
        }

        return curr.data;
    }

    static Node parent = null;

    static Node findFloor(Node root, int data) {

        if (root == null) {
            if (parent == null || parent.data < data)
                return parent;

            return root;
        }

        if (root.data > data)
            return findFloor(root.left, data);

        else if (root.data < data) {
            parent = root;
            return findFloor(root.right, data);
        }

        return parent;
    }

    static Node findCeil(Node root, int data) {

        Node parent = null;

        while (root != null) {

            if (root.data == data)
                return root;

            if (root.data < data)
                root = root.right;

            else {
                parent = root;
                root = root.left;
            }
        }

        return parent;
    }

    

}
