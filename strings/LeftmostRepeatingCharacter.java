package strings;

import java.util.Arrays;

public class LeftmostRepeatingCharacter {
    public static void main(String[] args) {

        // String str = "aabcbd";
        // String str = "geeksforeeks";
        String str = "abcd";
        System.out.println(leftmostRepeatingEff(str));

    }

    public static int leftmostRepeatingEff(String str) {

        int[] index_array = new int[256];
        Arrays.fill(index_array, -1);

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            char current_character = str.charAt(i);

            if (index_array[current_character] == -1)
                index_array[current_character] = i;
            else
                res = Math.min(res, index_array[current_character]);
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
