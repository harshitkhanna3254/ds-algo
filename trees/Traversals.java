package trees;

public class Traversals {

    public static void main(String[] args) {
        BinaryTreeBasic root = new BinaryTreeBasic(10);
        root.left = new BinaryTreeBasic(20);
        root.right = new BinaryTreeBasic(30);
        root.right.left = new BinaryTreeBasic(40);
        root.right.right = new BinaryTreeBasic(50);

        inorder(root);
    }

    static void inorder(BinaryTreeBasic root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
}

