package strings;

public class CheckIfSubsequence {
    public static void main(String[] args) {
        String str = "ABCD";
        String sub = "AD";

        printSubstrings(str, sub);

        System.out.println(checkSubseqItr(str, sub));

    }

    public static boolean checkSubseqRec(String str, String sub, int i, int j) {

        if (i == 0)
            return true;
        if (j == 0)
            return false;

        if (str.charAt(i - 1) == sub.charAt(j - 1))
            checkSubseqRec(str, sub, i, j);
        else
            checkSubseqRec(str, sub, i - 1, j);

        return false;
    }

    public static void printSubstrings(String str, String sub) {

    }

    public static boolean checkSubseqItr(String str, String sub) {

        int i = 0;
        int j = 0;

        int size1 = str.length();
        int size2 = sub.length();

        while (i < size1 && j < size2) {
            if (str.charAt(i) == sub.charAt(j)) {
                j++;
            }
            i++;
        }

        return j == size2;
    }
}
