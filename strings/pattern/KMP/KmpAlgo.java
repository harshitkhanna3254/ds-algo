package strings.pattern.KMP;

import java.util.Arrays;

public class KmpAlgo {
    public static void main(String[] args) {

        String str = "ababcababaad";
        String pattern = "ababa";

        int[] lpsArr = new int[pattern.length()];

        LPSArray.lpsArray(pattern, lpsArr);

        System.out.println(Arrays.toString(lpsArr));

        kmp(str, pattern, lpsArr);
    }

    public static void kmp(String str, String pattern, int[] lpsArr) {
        System.out.println(1234);
        int STRING_LENGTH = str.length();
        int PATTERN_LENGTH = pattern.length();

        int i = 0;
        int j = 0;

        while (i < STRING_LENGTH) {
            if (str.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == PATTERN_LENGTH) {
                System.out.println("Pattern found at index : " + (i - j));
                j = lpsArr[j - 1];
            }

            else if (str.charAt(i) != pattern.charAt(j)) {
                if (j == 0) {
                    i++;
                } else {
                    j = lpsArr[j - 1];
                }
            }
        }

    }
}
