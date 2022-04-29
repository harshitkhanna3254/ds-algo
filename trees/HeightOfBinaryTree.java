package trees;

public class HeightOfBinaryTree {
    public static void main(String[] args) {

        BinaryTreeBasic basic = new BinaryTreeBasic();

        BinaryTreeBasic root = basic.smallTree();

        BinaryTreeBasic.printBinaryTree(root);

        int height = getHeight(root);

        System.out.println("Height of Binary tree is : " + height);
    }

    static int getHeight(BinaryTreeBasic root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = getHeight(root.left);

        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
