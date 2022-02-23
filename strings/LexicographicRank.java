package strings;

import java.util.Arrays;

public class LexicographicRank {
    public static void main(String[] args) {

        // String str = "STRING";
        // 598

        // String str = "BAC";
        // 3

        String str = "DCBA" ;
        // 24

        int result = lexRank(str);

        System.out.println(result);
    }

    public static int lexRank(String str) {

        int result = 1;

        int multiplier = fact(str.length());

        int[] countArray = new int[256];

        for (int i = 0; i < str.length(); i++) {
            countArray[str.charAt(i)]++;
        }

        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }

        System.out.println(Arrays.toString(countArray));

        for (int i = 0; i < str.length(); i++) {
            multiplier = multiplier / (str.length() - i);
            result += countArray[str.charAt(i) - 1] * multiplier;
            for (int j = str.charAt(i); j < 256; j++) {
                countArray[j]--;
            }
        }

        return result;
    }

    public static int fact(int num) {

        if (num == 1)
            return 1;

        return (num * fact(num - 1));
    }
}
