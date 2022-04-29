package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeBasic basic = new BinaryTreeBasic();

        BinaryTreeBasic root = basic.smallTree2();

        BinaryTreeBasic.printBinaryTree(root);

        levelTraverse(root);
    }

    static void levelTraverse(BinaryTreeBasic root) {
        Queue<BinaryTreeBasic> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);

        while (queue.size() > 1) {
            BinaryTreeBasic removedNode = queue.remove();

            if (removedNode == null) {
                System.out.println();
                queue.add(null);
            } else {
                System.out.print(removedNode.data + " ");

                if (removedNode.left != null)
                    queue.add(removedNode.left);

                if (removedNode.right != null)
                    queue.add(removedNode.right);
            }

        }

    }
}
