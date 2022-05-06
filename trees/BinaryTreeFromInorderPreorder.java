package trees;

public class BinaryTreeFromInorderPreorder {
    public static void main(String[] args) {

        // int[] inorder = { 20, 10, 30 };
        // int[] preorder = { 10, 20, 30 };

        int[] inorder = { 40, 20, 50, 10, 30, 80, 70, 90 };
        int[] preorder = { 10, 20, 40, 50, 30, 70, 80, 90 };

        int inStart = 0;
        int inEnd = inorder.length - 1;

        BinaryTreeBasic root = constructTree(inorder, preorder, inStart, inEnd);

        System.out.println("Tree converted to inorder list :: \n");

        BinaryTreeBasic.printBinaryTree(root);
    }

    static int preIndex = 0;

    static BinaryTreeBasic constructTree(int[] inorder, int[] preorder, int inStart, int inEnd) {

        if (inStart > inEnd)
            return null;

        BinaryTreeBasic root = new BinaryTreeBasic(preorder[preIndex++]);

        int inIndex = 0;
        for (int x : inorder) {
            if (x == root.data) {
                break;
            }
            inIndex++;
        }

        root.left = constructTree(inorder, preorder, inStart, inIndex - 1);
        root.right = constructTree(inorder, preorder, inIndex + 1, inEnd);

        return root;
    }
}
