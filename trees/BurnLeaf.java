package trees;

import java.util.ArrayList;
import java.util.List;

/*
    ! Found v difficult
    * didn't complete
*/

public class BurnLeaf {
    public static void main(String[] args) {

        BinaryTreeBasic basic = new BinaryTreeBasic();

        BinaryTreeBasic root = basic.smallTree6();
        BinaryTreeBasic.printBinaryTree(root);

        List<BinaryTreeBasic> list = new ArrayList<>();
        int leaf = 9;
        getAncestors(root, leaf, list);

        System.out.println(list.toString());

        int time = timeTakenToBurnTree(root);
        System.out.println(time);

    }

    static int timeTakenToBurnTree(BinaryTreeBasic root) {

        return 1;
    }

    static boolean getAncestors(BinaryTreeBasic root, int leaf, List<BinaryTreeBasic> list) {

        if (root == null)
            return false;

        list.add(root);

        if (root.data == leaf) {
            return true;
        }

        boolean left = getAncestors(root.left, leaf, list);
        boolean right = getAncestors(root.right, leaf, list);

        if (left || right)
            return true;

        list.remove(list.size() - 1);

        return false;
    }

    static int getHeight(BinaryTreeBasic root) {
        if (root == null)
            return 0;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
