package strings;

public class CheckIfSubsequence {
    public static void main(String[] args) {
        String str = "ABCD";
        String sub = "AD";

        printSubstrings(str, sub);

        System.out.println(checkSubseq(str, sub));

    }

    public static void printSubstrings(String str, String sub) {

    }

    public static boolean checkSubseq(String str, String sub) {

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
