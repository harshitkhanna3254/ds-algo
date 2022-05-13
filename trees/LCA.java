package trees;

import java.util.ArrayList;

public class LCA {
    public static void main(String[] args) {

        BinaryTreeBasic basic = new BinaryTreeBasic();

        BinaryTreeBasic root = basic.smallTree4();

        BinaryTreeBasic.printBinaryTree(root);

        int a = 60;
        int b = 70;

        BinaryTreeBasic lca = getLca(root, a, b);
        System.out.println("LCA of the nodes " + a + " and " + b + " is " + lca.data);

        BinaryTreeBasic lcaEfficient = getLcaEfficient(root, a, b);
        System.out.println("LCA of the nodes " + a + " and " + b + " is " + lcaEfficient.data);
    }

    static BinaryTreeBasic getLca(BinaryTreeBasic root, int a, int b) {

        ArrayList<BinaryTreeBasic> lcaList1 = new ArrayList<>();
        ArrayList<BinaryTreeBasic> lcaList2 = new ArrayList<>();

        boolean getLeft = fillPath(root, a, lcaList1);
        boolean getRight = fillPath(root, b, lcaList2);

        if (!getLeft || !getRight) {
            return null;
        }

        for (int i = 0; i < lcaList1.size() - 1 && i < lcaList2.size() - 1; i++) {
            if (lcaList1.get(i + 1) != lcaList2.get(i + 1)) {
                return lcaList1.get(i);
            }
        }

        return null;

    }

    static boolean fillPath(BinaryTreeBasic root, int x, ArrayList<BinaryTreeBasic> lcaList) {
        if (root == null)
            return false;

        lcaList.add(root);

        if (root.data == x)
            return true;

        boolean getLeft = fillPath(root.left, x, lcaList);
        boolean getRight = fillPath(root.right, x, lcaList);

        if (getLeft || getRight)
            return true;

        lcaList.remove(lcaList.size() - 1);

        return false;
    }

    static BinaryTreeBasic getLcaEfficient(BinaryTreeBasic root, int a, int b) {
        if (root == null)
            return null;

        if (root.data == a || root.data == b) {
            return root;
        }

        BinaryTreeBasic lca1 = getLcaEfficient(root.left, a, b);
        BinaryTreeBasic lca2 = getLcaEfficient(root.right, a, b);

        if (lca1 != null && lca2 != null) {
            return root;
        }

        if (lca1 != null)
            return lca1;
        else
            return lca2;

    }
}
