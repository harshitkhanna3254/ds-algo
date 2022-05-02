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

        if (root == null)
            return true;

        if (root.left == null && root.right == null)
            return true;

        int sum = 0;

        if (root.left != null)
            sum += root.left.data;

        if (root.right != null)
            sum += root.right.data;

        boolean leftCool = isCool(root.left);
        boolean rightCool = isCool(root.right);

        return (sum == root.data && leftCool && rightCool);
    }

}
