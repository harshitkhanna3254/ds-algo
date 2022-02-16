package strings.pattern;

public class NaiveDistinct {
    public static void main(String[] args) {
        String str = "GEEKSFORGEEKS";
        String pattern = "EKS";

        // String str = "ABCABCDABCD";
        // String pattern = "ABCD";

        // String str = "ABCcxzvxzvCD";
        // String pattern = "ABCD";

        naivePatternDistinct(str, pattern);
    }

    public static void naivePatternDistinct(String str, String pattern) {

        int mainIndex = 0;

        int m = str.length();
        int n = pattern.length();

        while (mainIndex <= (m - n)) {

            int patternIndex = 0;
            while (patternIndex != n) {
                if (str.charAt(mainIndex) == pattern.charAt(patternIndex)) {
                    mainIndex++;
                    patternIndex++;
                } else {
                    if (patternIndex != 0) {
                        break;
                    }
                    mainIndex++;
                    break;
                }
            }

            if (patternIndex == n) {
                System.out.println("Pattern Found at index :" + (mainIndex - patternIndex + 1));
            }

        }

    }
}
