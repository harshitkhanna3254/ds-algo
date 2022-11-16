package binary_search_tree;

public class DistinctBST {


    private static int findDistinctBSTs(int n) {
        int result = 0;
        if (n == 1 || n == 0)
            return 1;
        for (int i = 0; i < n; i++)
            result += findDistinctBSTs(i) * findDistinctBSTs(n - i - 1);

        return result;
    }

    public static void main(String[] args) {
        int N = 8;

        int distinctTrees = findDistinctBSTs(N);

        System.out.println("Number of distinct BSTs are: " + distinctTrees);
    }
}
