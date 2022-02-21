package strings;

import java.util.Arrays;

public class AnagramSearch {
    public static void main(String[] args) {

        String text = "geeksforgeeks";
        String pattern = "frog";

        // String text = "geeksforgeeks";
        // String pattern = "rseek";

        Boolean b = anagramSearch(text, pattern);
        System.out.println(b);
    }

    public static boolean anagramSearch(String text, String pattern) {

        int CHAR = 256;

        int[] countArrayText = new int[256];
        int[] countArrayPattern = new int[256];

        for (int i = 0; i < pattern.length(); i++) {
            countArrayText[text.charAt(i)]++;
            countArrayPattern[pattern.charAt(i)]++;
        }

        if (Arrays.equals(countArrayText, countArrayPattern)) {
            return true;
        }

        int start = 0;
        for (int i = pattern.length(); i < text.length(); i++) {
            countArrayText[text.charAt(start)]--;
            countArrayText[text.charAt(i)]++;

            if (Arrays.equals(countArrayText, countArrayPattern)) {
                return true;
            }

            start++;
        }

        return false;
    }
}
