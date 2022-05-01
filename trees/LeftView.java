package trees;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class LeftView {

    static int max_level = 0;

    public static void main(String[] args) {

        BinaryTreeBasic basic = new BinaryTreeBasic();

        BinaryTreeBasic root = basic.smallTree3();

        int current_level = 1;

        BinaryTreeBasic.printBinaryTree(root);

        // printLeftView(root);

        printLeftViewRecursive(root, current_level);

    }

    static void printLeftViewRecursive(BinaryTreeBasic root, int current_level) {

        if (root == null)
            return;

        if (max_level < current_level) {
            System.out.print(root.data + " ");
            max_level = current_level;
        }

        printLeftViewRecursive(root.left, current_level + 1);
        printLeftViewRecursive(root.right, current_level + 1);

    }

    static void printLeftView(BinaryTreeBasic root) {
        Queue<BinaryTreeBasic> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);

        Boolean leftMost_node = true;

        while (queue.size() > 1) {
            BinaryTreeBasic removed_node = queue.remove();

            if (removed_node == null) {
                queue.add(null);
                leftMost_node = true;
                continue;
            }

            if (removed_node.left != null)
                queue.add(removed_node.left);

            if (removed_node.right != null)
                queue.add(removed_node.right);

            if (leftMost_node) {
                System.out.print(removed_node.data + " ");
                leftMost_node = false;
            }

        }

    }
}
