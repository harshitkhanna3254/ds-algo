package trees;

public class Diameter {
    public static void main(String[] args) {

        BinaryTreeBasic basic = new BinaryTreeBasic();

        BinaryTreeBasic root = basic.smallTree4();

        BinaryTreeBasic.printBinaryTree(root);

        int height = getHeight(root);

        System.out.println("Height of the tree is " + height);

        int diameter = getDiameter(root);

        System.out.println("Diameter of the tree is " + diameter);

        getDiameterEfficient(root);

        System.out.println("Diameter(Efficient) of the tree is " + resDiameter);
    }

    static int resDiameter = 0;

    static int getDiameterEfficient(BinaryTreeBasic root) {
        if (root == null)
            return 0;

        int leftHeight = getDiameterEfficient(root.left);
        int rightHeight = getDiameterEfficient(root.right);

        int diameter = 1 + leftHeight + rightHeight;

        resDiameter = Math.max(diameter, resDiameter);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    static int getDiameter(BinaryTreeBasic root) {

        if (root == null)
            return 0;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        int diameter = leftHeight + rightHeight + 1;

        int leftDiameter = getDiameter(root.left);
        int rightDiameter = getDiameter(root.right);

        return Math.max(diameter, Math.max(leftDiameter, rightDiameter));
    }

    static int getHeight(BinaryTreeBasic root) {
        if (root == null)
            return 0;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
