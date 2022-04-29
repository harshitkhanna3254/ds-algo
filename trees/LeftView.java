package trees;

public class LeftView {

    public static void main(String[] args) {

        BinaryTreeBasic basic = new BinaryTreeBasic();

        BinaryTreeBasic root = basic.smallTree();

        BinaryTreeBasic.printBinaryTree(root);

        printLeftView(root);
    }

    static void printLeftView(BinaryTreeBasic root) {

    }
}
