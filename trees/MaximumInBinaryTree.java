package trees;

public class MaximumInBinaryTree {
    public static void main(String[] args) {
        BinaryTreeBasic basic = new BinaryTreeBasic();

        BinaryTreeBasic root = basic.smallTree4();

        BinaryTreeBasic.printBinaryTree(root);

        int size = getMax(root);

        System.out.println("Max of Binary tree is : " + size);
    }

    static int getMax(BinaryTreeBasic root) {

        if (root == null)
            return 0;

        int leftMax = getMax(root.left);
        int rightMax = getMax(root.right);

        return Math.max(Math.max(leftMax, rightMax), root.data);
    }
}
