package trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {
    public static void main(String[] args) {

        BinaryTreeBasic basic = new BinaryTreeBasic();

        BinaryTreeBasic root = basic.smallTree6();

        BinaryTreeBasic.printBinaryTree(root);

        int max_width = maxWidth(root);

        System.out.println("Max width of the tree is " + max_width);
    }

    static int maxWidth(BinaryTreeBasic root) {

        Queue<BinaryTreeBasic> queue = new LinkedList<>();
        queue.add(root);

        int max_width = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            max_width = Math.max(max_width, size);

            for (int i = 0; i < size; i++) {
                BinaryTreeBasic removed_node = queue.remove();

                if (removed_node.left != null)
                    queue.add(removed_node.left);

                if (removed_node.right != null)
                    queue.add(removed_node.right);

            }
        }

        return max_width;
    }
}
