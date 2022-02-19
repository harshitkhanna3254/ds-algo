package strings.pattern.KMP;

import java.util.Arrays;

// string = "abacabad"
// lpsArr = {0, 0, 1, 0, 1, 2, 3, 0 }

// string = "abbabb"
// lpsArr = {0, 0, 0, 1, 2, 3}

public class LPSArray {
    public static void main(String[] args) {

        String str = "aaabaaaac";
        int[] lpsArr = new int[str.length()];

        System.out.println(Arrays.toString(lpsArray(str, lpsArr)));
    }

    public static int[] lpsArray(String str, int[] lpsArr) {

        int n = str.length();
        lpsArr[0] = 0;

        int len = 0;
        int i = 1;

        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lpsArr[i] = len;
                i++;
            } else {
                if (len == 0) {
                    lpsArr[i] = 0;
                    i++;
                } else {
                    len = lpsArr[len - 1];
                }
            }
        }

        return lpsArr;
    }
}
