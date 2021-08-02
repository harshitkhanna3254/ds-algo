package strings.pattern;

public class Naive {
    public static void main(String[] args) {
        String str = "ABCABCD";

        String pattern = "ABCD";

        boolean contains = naivePatternSearch(str, pattern);

        System.out.println(contains);
    }

    public static boolean naivePatternSearch(String str, String pattern) {

        int start = 0;

        while (start != str.length()) {

            if (str.charAt(start) == pattern.charAt(0)) {
                int index1 = start + 1;
                int index2 = 1;

                Boolean contains = true;

                while (index2 != pattern.length()) {
                    if (str.charAt(index1) != pattern.charAt(index2)) {
                        start = index1 - 1;
                        contains = false;
                        break;
                    }
                    index1++;
                    index2++;
                }

                if (contains == true)
                    return true;
            }

            start++;
        }

        return false;

    }
}
