package trees;

public class NodesAtKDistance {
    public static void main(String[] args) {
        BinaryTreeBasic basic = new BinaryTreeBasic();

        BinaryTreeBasic root = basic.smallTree2();

        int k = 2;

        BinaryTreeBasic.printBinaryTree(root);

        printNodesAtKDistance(root, k);
    }

    static void printNodesAtKDistance(BinaryTreeBasic root, int k) {

        if (root == null) {
            return;
        }

        if (k == 0) {
            System.out.print(root.data + "  ");
            return;
        }

        printNodesAtKDistance(root.left, k - 1);
        printNodesAtKDistance(root.right, k - 1);

    }
}
