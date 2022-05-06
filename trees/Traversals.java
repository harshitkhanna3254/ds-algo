package trees;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversals {

    public static void main(String[] args) {
        // BinaryTreeBasic root = new BinaryTreeBasic(10);
        // root.left = new BinaryTreeBasic(20);
        // root.right = new BinaryTreeBasic(30);
        // root.right.left = new BinaryTreeBasic(40);
        // root.right.right = new BinaryTreeBasic(50);

        // inorder(root);

        BinaryTreeBasic basic = new BinaryTreeBasic();
        BinaryTreeBasic root = basic.smallTree4();
        BinaryTreeBasic.printBinaryTree(root);

        spiral(root);

    }

    static void inorder(BinaryTreeBasic root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    static void spiral(BinaryTreeBasic root) {

        if (root == null)
            return;

        Stack<BinaryTreeBasic> s1 = new Stack<BinaryTreeBasic>();
        Stack<BinaryTreeBasic> s2 = new Stack<BinaryTreeBasic>();

        s1.add(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.empty()) {
                BinaryTreeBasic removed_node = s1.pop();

                System.out.print(removed_node.data + " ");

                if (removed_node.right != null)
                    s2.add(removed_node.right);

                if (removed_node.left != null)
                    s2.add(removed_node.left);
            }

            while (!s2.empty()) {
                BinaryTreeBasic removed_node = s2.pop();

                System.out.print(removed_node.data + " ");

                if (removed_node.left != null)
                    s1.add(removed_node.left);
                if (removed_node.right != null)
                    s1.add(removed_node.right);
            }
        }

    }
}
