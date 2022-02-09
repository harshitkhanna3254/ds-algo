package strings.pattern;

public class Naive {
    public static void main(String[] args) {
        String str = "GEEKSFORGEEKS";
        String pattern = "EKS";

        // String str = "ABCABCDABCD";
        // String pattern = "ABCD";

        // String str = "ABCcxzvxzvCD";
        // String pattern = "ABCD";

        naivePatternSearch(str, pattern);
    }

    public static void naivePatternSearch(String str, String pattern) {

        int m = str.length();
        int n = pattern.length();

        for (int i = 0; i <= m - n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if(str.charAt(i+j) != pattern.charAt(j))
                    break;
            }

            if(j == n)
                System.out.println("Starts at : " + i);
        }

    }
}
