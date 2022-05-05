package trees;

public class BinaryTreeToDLL {
    public static void main(String[] args) {

        BinaryTreeBasic basic = new BinaryTreeBasic();

        BinaryTreeBasic root = basic.smallTree6();

        BinaryTreeBasic.printBinaryTree(root);

        BinaryTreeBasic head = treeToDLL(root);

        System.out.println("Tree converted to inorder list :: \n");
        printlist(head);
    }

    static BinaryTreeBasic prev;

    static BinaryTreeBasic treeToDLL(BinaryTreeBasic root) {

        if (root == null)
            return null;

        BinaryTreeBasic headOfLinkedList = treeToDLL(root.left);

        if (prev == null) {
            headOfLinkedList = root;
        } else {
            prev.right = root;
            root.left = prev;
        }

        prev = root;

        treeToDLL(root.right);

        return headOfLinkedList;
    }

    public static void printlist(BinaryTreeBasic head) {
        BinaryTreeBasic curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }
}
