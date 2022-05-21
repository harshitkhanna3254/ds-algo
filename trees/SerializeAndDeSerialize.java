package trees;

import java.util.ArrayList;

public class SerializeAndDeSerialize {
    public static void main(String[] args) {

        BinaryTreeBasic basic = new BinaryTreeBasic();

        BinaryTreeBasic root = basic.smallTree6();
        BinaryTreeBasic.printBinaryTree(root);

        ArrayList<Integer> arrayList = new ArrayList<>();

        serialize(root, arrayList);

        System.out.println(arrayList.toString());

        BinaryTreeBasic deserialized_root = deserialize(arrayList);
        BinaryTreeBasic.printBinaryTree(deserialized_root);
    }

    static void serialize(BinaryTreeBasic root, ArrayList<Integer> arrayList) {
        if (root == null) {
            arrayList.add(-1);
            return;
        }

        System.out.println(root.data);
        arrayList.add(root.data);
        serialize(root.left, arrayList);
        serialize(root.right, arrayList);

    }

    static int index = 0;

    static BinaryTreeBasic deserialize(ArrayList<Integer> arrayList) {

        if (index == arrayList.size())
            return null;

        int value = arrayList.get(index);
        index++;

        if (value == -1) {
            return null;
        }

        BinaryTreeBasic root = new BinaryTreeBasic(value);

        root.left = deserialize(arrayList);
        root.right = deserialize(arrayList);

        return root;
    }
}
