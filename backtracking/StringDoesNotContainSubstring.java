package backtracking;

public class StringDoesNotContainSubstring {


    private static void printAllPermutations(String str, int l, int r) {

        if (l == r) {
            System.out.println(str);
            return;
        }

        for (int i = l; i <= r; i++) {
            if (isSafe(str, l, i, r)) {
                str = new String(swapCharacters(str, l, i));
                printAllPermutations(str, l + 1, r);
                str = new String(swapCharacters(str, l, i));
            }
        }
    }


    private static boolean isSafe(String str, int l, int i, int r) {

        //if str contains AB as substring, return
        if (l != 0 && str.charAt(i) == 'B' && str.charAt(l - 1) == 'A')
            return false;

        if (l + 1 == r && str.charAt(l) == 'B' && str.charAt(i) == 'A')
            return false;

        return true;
    }

    private static char[] swapCharacters(String str, int i, int j) {
        char[] strArr = str.toCharArray();
        char temp = strArr[i];
        strArr[i] = strArr[j];
        strArr[j] = temp;
        return strArr;
    }

    public static void main(String[] args) {
        String str = "ABC";
        printAllPermutations(str, 0, str.length() - 1);
    }
}
