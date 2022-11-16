package greedy;

import trees.BinaryTreeBasic;
import trees.BinaryTreeHuffmanNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HuffmanCoding {

    private static BinaryTreeHuffmanNode getHuffmanTree(char[] charArr, int[] freqArr) {

        PriorityQueue<BinaryTreeHuffmanNode> minHeap = new PriorityQueue<>(new HuffmanComparator());

        for (int i = 0; i < charArr.length; i++) {
            BinaryTreeHuffmanNode node = new BinaryTreeHuffmanNode(charArr[i], freqArr[i], null, null);
            minHeap.add(node);
        }

        BinaryTreeHuffmanNode root = null;

        while (minHeap.size() > 1) {
            BinaryTreeHuffmanNode left = minHeap.poll();
            BinaryTreeHuffmanNode right = minHeap.poll();
            int dollarFreq = left.getFreq() + right.getFreq();

            BinaryTreeHuffmanNode dollarNode = new BinaryTreeHuffmanNode('$', dollarFreq, left, right);
            minHeap.add(dollarNode);
            root = dollarNode;
        }

        return root;
    }

    private static void printHuffmanTree(BinaryTreeHuffmanNode root, String str) {

        if (root == null)
            return;

        if (root.getLeft() == null && root.getRight() == null && root.getCharacter() != '$')
            System.out.println(root.getCharacter() + ":" + str);

        printHuffmanTree(root.getLeft(), str + "0");
        printHuffmanTree(root.getRight(), str + "1");
    }

    public static void main(String[] args) {
//        char[] charArr = {'a', 'd', 'b', 'e', 'f'};
//        int[] freqArr = {10, 50, 20, 40, 80};

        char[] charArr = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] freqArr = {5, 9, 12, 13, 16, 45};

        BinaryTreeHuffmanNode root = getHuffmanTree(charArr, freqArr);

        printHuffmanTree(root, "");

        BinaryTreeHuffmanNode.printBinaryTree(root);
    }
}


class HuffmanComparator implements Comparator<BinaryTreeHuffmanNode> {
    //override
    public int compare(BinaryTreeHuffmanNode x, BinaryTreeHuffmanNode y) {
        return x.getFreq() - y.getFreq();
    }
}
