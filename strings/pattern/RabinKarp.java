package strings.pattern;

public class RabinKarp {

    public static void main(String[] args) {
        // String str = "GEEKSFORGEEKS";
        // String pattern = "EKS";

        // String str = "ABCABCDABCD";
        // String pattern = "ABCD";

        // String str = "AAAAAAAAA";
        // String pattern = "AAA";

        String str = "GEEKS FOR GEEKS";
        String pattern = "GEEK";

        rabinkarpAlgoOriginal(str, pattern);

        rabinKarpAlgoByKhanna(str, pattern);
    }

    public static void rabinkarpAlgoOriginal(String str, String pattern) {
        System.out.println("Original");
    }

    public static void rabinKarpAlgoByKhanna(String str, String pattern) {

        int d = 5;

        int m = str.length();
        int n = pattern.length();

        double pattern_hash = 0;
        for (int i = 0; i < pattern.length(); i++) {
            pattern_hash += (int) pattern.charAt(i) * Math.pow(d, n - i - 1);
        }

        int start = 0;
        int end = 0;

        double main_hash = 0;
        while (end != n) {
            main_hash += (int) str.charAt(end) * Math.pow(d, n - end - 1);
            end++;
        }

        // System.out.println(main_hash + " " + pattern_hash);

        if (main_hash == pattern_hash) {
            System.out.println("Wow! Pattern found at first index : " + start);
        }

        while (end != m) {
            main_hash = (main_hash - (int) str.charAt(start) * Math.pow(d, n - 1)) * Math.pow(d, 1)
                    + (int) str.charAt(end);

            if (main_hash == pattern_hash) {

                //Can check for spurious hits here

                System.out.println("Pattern found at index : " + (start + 1));
            }

            start++;
            end++;
        }

    }

}
