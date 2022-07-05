package binary_search_tree;

import java.util.ArrayList;

public class FixBSTWithTwNodesSwapped {
    public static void main(String[] args) {
        Node root = Node.generateBigBST();

        Node.printBinaryTree(root);

        ArrayList<Integer> inorder = new ArrayList<>();

        swapNodes(root, inorder);
    }

    static void swapNodes(Node root, ArrayList<Integer> inorder) {
        if (root == null)
            return;

        swapNodes(root.left, inorder);

        inorder.add(root.data);

        swapNodes(root.right, inorder);
    }
}
