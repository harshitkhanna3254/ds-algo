package binary_search_tree;

public class CheckForBST {
    public static void main(String[] args) {
        Node root = Node.generateBigBST();

        Node.printBinaryTree(root);

        inOrder(root);

        System.out.println("\nChecking if BST (inorder check) : " + checkBstInorder(root));

        int min = 0;
        int max = Integer.MAX_VALUE;
        System.out.println("\nChecking if BST (efficient check) : " + checkBst(root, min, max));
    }

    public static void inOrder(Node root) {

        if (root == null)
            return;

        inOrder(root.left);

        System.out.print(root.data + " ");

        inOrder(root.right);
    }

    static int prev = Integer.MIN_VALUE;

    public static boolean checkBstInorder(Node root) {

        if (root == null)
            return true;

        boolean checkLeft = checkBstInorder(root.left);

        if (checkLeft == false)
            return false;

        if (root.data <= prev)
            return false;

        prev = root.data;

        return checkBstInorder(root.right);
    }

    public static Boolean checkBst(Node root, int min, int max) {

        if (root == null)
            return true;

        boolean checkLeft = checkBst(root.left, min, root.data);
        if (!checkLeft)
            return false;

        boolean checkRight = checkBst(root.right, root.data, max);
        if (!checkRight)
            return false;

        if (root.data <= min || root.data >= max)
            return false;

        return true;
    }
}
