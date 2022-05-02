package trees;

public class HeightBalancedTree {
    public static void main(String[] args) {

        BinaryTreeBasic basic = new BinaryTreeBasic();

        BinaryTreeBasic root = basic.smallTree6();

        int current_level = 1;

        BinaryTreeBasic.printBinaryTree(root);

        Boolean isCool = isBalanced(root, current_level);

        if (isCool) {
            System.out.println("Yup. It's balaced");
        } else {
            System.out.println("Nah not balaced.");
        }
    }

    static boolean isBalanced(BinaryTreeBasic root, int current_level) {

        boolean leftBalanced = isBalanced(root.left, current_level + 1);
        boolean rightBalanced = isBalanced(root.right, current_level + 1);

        return true;
    }
}
