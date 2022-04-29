package trees;

public class SizeOfBinaryTree {
    public static void main(String[] args) {
        BinaryTreeBasic basic = new BinaryTreeBasic();

        BinaryTreeBasic root = basic.smallTree3();

        BinaryTreeBasic.printBinaryTree(root);

        int size = getSize(root);

        System.out.println("Size of Binary tree is : " + size);
    }

    static int getSize(BinaryTreeBasic root) {

        if (root == null)
            return 0;

        int leftSize = getSize(root.left);
        int rightSize = getSize(root.right);

        return leftSize + rightSize + 1;
    }
}
