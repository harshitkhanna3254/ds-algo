package binary_search_tree;

import java.util.LinkedList;

/*
 * Design a data structure where the following operations are efficient
 ? Search
 ? Insert
 ? Delete
 ? Kth Smallest
 */

class AugmentedNode {
    int data;
    AugmentedNode left;
    AugmentedNode right;
    int leftCount;

    AugmentedNode(int data) {
        this.data = data;
        leftCount = 0;
    }

    public static void printBinaryTree(AugmentedNode root) {
        LinkedList<AugmentedNode> treeLevel = new LinkedList<AugmentedNode>();
        treeLevel.add(root);
        LinkedList<AugmentedNode> temp = new LinkedList<AugmentedNode>();
        int counter = 0;
        int height = heightOfTree(root) - 1;
        // System.out.println(height);
        double numberOfElements = (Math.pow(2, (height + 1)) - 1);
        // System.out.println(numberOfElements);
        while (counter <= height) {
            AugmentedNode removed = treeLevel.removeFirst();
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

    public static void printSpace(double n, AugmentedNode removed) {
        for (; n > 0; n--) {
            System.out.print("\t");
        }
        if (removed == null) {
            System.out.print(" ");
        } else {
            System.out.print(removed.data);
        }
    }

    public static int heightOfTree(AugmentedNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
    }

}

public class BSTWithKthSmallestElement {
    AugmentedNode node;

    public static AugmentedNode insert(AugmentedNode root, int data) {
        if (root == null)
            return new AugmentedNode(data);

        if (root.data > data) {
            root.left = insert(root.left, data);
            root.leftCount++;
        }

        else if (root.data < data)
            root.right = insert(root.right, data);

        return root;
    }

    public static AugmentedNode kthSmallest(AugmentedNode root, int k) {

        if (root == null)
            return root;

        if (root.leftCount + 1 == k)
            return root;

        else if (root.leftCount + 1 > k)
            return kthSmallest(root.left, k);

        else
            return kthSmallest(root.right, k - root.leftCount - 1);
    }

}

class TestKth {
    public static void main(String[] args) {

        AugmentedNode root = new AugmentedNode(10);

        BSTWithKthSmallestElement.insert(root, 5);
        BSTWithKthSmallestElement.insert(root, 15);
        BSTWithKthSmallestElement.insert(root, 3);
        BSTWithKthSmallestElement.insert(root, 7);
        BSTWithKthSmallestElement.insert(root, 12);
        BSTWithKthSmallestElement.insert(root, 20);
        BSTWithKthSmallestElement.insert(root, 1);
        BSTWithKthSmallestElement.insert(root, 4);
        BSTWithKthSmallestElement.insert(root, 6);
        BSTWithKthSmallestElement.insert(root, 11);
        BSTWithKthSmallestElement.insert(root, 17);

        AugmentedNode.printBinaryTree(root);

        AugmentedNode kthSmallestNode = BSTWithKthSmallestElement.kthSmallest(root, 7);
        System.out.println(kthSmallestNode.data);

    }
}
