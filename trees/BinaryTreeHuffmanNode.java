package trees;

import java.util.LinkedList;

public class BinaryTreeHuffmanNode {
    char character;
    int freq;
    BinaryTreeHuffmanNode left;
    BinaryTreeHuffmanNode right;

    public BinaryTreeHuffmanNode(char character, int freq, BinaryTreeHuffmanNode left, BinaryTreeHuffmanNode right) {
        this.character = character;
        this.freq = freq;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "BinaryTreePairNode{" +
                "character=" + character +
                ", freq=" + freq +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public static void printBinaryTree(BinaryTreeHuffmanNode root) {
        LinkedList<BinaryTreeHuffmanNode> treeLevel = new LinkedList<BinaryTreeHuffmanNode>();
        treeLevel.add(root);
        LinkedList<BinaryTreeHuffmanNode> temp = new LinkedList<BinaryTreeHuffmanNode>();
        int counter = 0;
        int height = heightOfTree(root) - 1;
        // System.out.println(height);
        double numberOfElements = (Math.pow(2, (height + 1)) - 1);
        // System.out.println(numberOfElements);
        while (counter <= height) {
            BinaryTreeHuffmanNode removed = treeLevel.removeFirst();
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

    public static void printSpace(double n, BinaryTreeHuffmanNode removed) {
        for (; n > 0; n--) {
            System.out.print("\t");
        }
        if (removed == null) {
            System.out.print(" ");
        } else {
            System.out.print(removed.character + ":" + removed.freq);
        }
    }

    public static int heightOfTree(BinaryTreeHuffmanNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    public BinaryTreeHuffmanNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeHuffmanNode left) {
        this.left = left;
    }

    public BinaryTreeHuffmanNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeHuffmanNode right) {
        this.right = right;
    }
}
