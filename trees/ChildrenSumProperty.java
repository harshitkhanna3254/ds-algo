package trees;

public class ChildrenSumProperty {
    public static void main(String[] args) {

        BinaryTreeBasic basic = new BinaryTreeBasic();

        BinaryTreeBasic root = basic.smallTree2();

        BinaryTreeBasic.printBinaryTree(root);

        Boolean isCool = isCool(root);

        if (isCool) {
            System.out.println("Yup. It's cool");
        } else {
            System.out.println("Nah not cool.");
        }
    }

    static boolean isCool(BinaryTreeBasic root) {

        int total = findIfCool(root);

        return total == root.data;
    }

    static int findIfCool(BinaryTreeBasic root) {


        if (root == null)
            return 0;

        if (root.left == null && root.right == null) {
            return root.data;
        }

        int left_sum = findIfCool(root.left);
        int right_sum = findIfCool(root.right);

        return left_sum + right_sum;
    }
}
