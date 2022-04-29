package trees;

import java.util.LinkedList;

import javax.swing.RootPaneContainer;

public class BinaryTreeBasic {
    int data;
    BinaryTreeBasic left;
    BinaryTreeBasic right;

    BinaryTreeBasic() {
    }

    BinaryTreeBasic(int data) {
        this.data = data;
    }

    BinaryTreeBasic smallTree() {
        BinaryTreeBasic root = new BinaryTreeBasic(10);
        root.left = new BinaryTreeBasic(20);
        root.right = new BinaryTreeBasic(30);
        root.right.left = new BinaryTreeBasic(40);
        root.right.right = new BinaryTreeBasic(50);

        return root;
    }

    BinaryTreeBasic smallTree2() {
        BinaryTreeBasic root = new BinaryTreeBasic(10);
        root.left = new BinaryTreeBasic(20);
        root.right = new BinaryTreeBasic(30);
        root.right.right = new BinaryTreeBasic(60);
        root.left.left = new BinaryTreeBasic(40);
        root.left.right = new BinaryTreeBasic(50);

        return root;
    }

    BinaryTreeBasic smallTree3() {
        BinaryTreeBasic root = new BinaryTreeBasic(10);
        root.left = new BinaryTreeBasic(6);
        root.right = new BinaryTreeBasic(8);
        root.right.right = new BinaryTreeBasic(7);
        root.right.right.left = new BinaryTreeBasic(11);
        root.right.right.right = new BinaryTreeBasic(12);

        return root;
    }

    BinaryTreeBasic smallTree4() {
        BinaryTreeBasic root = new BinaryTreeBasic(10);
        root.left = new BinaryTreeBasic(30);
        root.right = new BinaryTreeBasic(40);
        root.left.left = new BinaryTreeBasic(80);
        root.left.left.right = new BinaryTreeBasic(70);
        root.right.left = new BinaryTreeBasic(60);
        root.right.right = new BinaryTreeBasic(20);
        root.right.right.right = new BinaryTreeBasic(77);

        return root;
    }

    BinaryTreeBasic smallTree5() {
        BinaryTreeBasic root = new BinaryTreeBasic(30);
        root.right = new BinaryTreeBasic(50);
        root.right.left = new BinaryTreeBasic(60);
        root.right.left.right = new BinaryTreeBasic(10);

        return root;
    }

    public static void printBinaryTree(BinaryTreeBasic root) {
        LinkedList<BinaryTreeBasic> treeLevel = new LinkedList<BinaryTreeBasic>();
        treeLevel.add(root);
        LinkedList<BinaryTreeBasic> temp = new LinkedList<BinaryTreeBasic>();
        int counter = 0;
        int height = heightOfTree(root) - 1;
        // System.out.println(height);
        double numberOfElements = (Math.pow(2, (height + 1)) - 1);
        // System.out.println(numberOfElements);
        while (counter <= height) {
            BinaryTreeBasic removed = treeLevel.removeFirst();
            if (temp.isEmpty()) {
                printSpace(numberOfElements / Math.pow(2, counter + 1), removed);
            } else {
                printSpace(numberOfElements / Math.pow(2, counter), removed);
            }
            if (removed == null) {
                temp.add(null);
                temp.add(null);
            } else {
                temp.add(removed.left);
                temp.add(removed.right);
            }

            if (treeLevel.isEmpty()) {
                System.out.println("");
                System.out.println("");
                treeLevel = temp;
                temp = new LinkedList<>();
                counter++;
            }

        }

        System.out.println();
    }

    public static void printSpace(double n, BinaryTreeBasic removed) {
        for (; n > 0; n--) {
            System.out.print("\t");
        }
        if (removed == null) {
            System.out.print(" ");
        } else {
            System.out.print(removed.data);
        }
    }

    public static int heightOfTree(BinaryTreeBasic root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
    }

}
