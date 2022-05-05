package trees;

public class HeightBalancedTree {
    public static void main(String[] args) {

        BinaryTreeBasic basic = new BinaryTreeBasic();

        BinaryTreeBasic root = basic.smallTree6();

        BinaryTreeBasic.printBinaryTree(root);

        int isCool = isBalanced(root);

        if (isCool == -1) {
            System.out.println("Nah not balaced.");
        } else {
            System.out.println("Yup. It's balaced");
        }
    }

    static int isBalanced(BinaryTreeBasic root) {

        if (root == null)
            return 0;

        int leftHeight = isBalanced(root.left);
        if (leftHeight == -1)
            return -1;

        int rightHeight = isBalanced(root.right);
        if (rightHeight == -1)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        return Math.max(leftHeight, rightHeight) + 1;

    }
}
