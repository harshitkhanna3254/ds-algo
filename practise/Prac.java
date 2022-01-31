package practise;

public class Prac {
    public static void main(String[] args) {

        // String str = "ABCDCBA";
        // String str = "ABBA";
        // String str = "geeks";

        // String str1 = "ABCDEF";
        // String str2 = "AED";
        String str1 = "ABCDEF";
        String str2 = "ACF";

        // System.out.println(pallindrome(str));
        // System.out.println(subsequence(str1, str2));
        System.out.println(subsequenceRecursive(str1, str2, str1.length(), str2.length()));

    }

    public static boolean subsequenceRecursive(String str1, String str2, int length1, int length2) {
        
        if (length2 == 0)
            return true;

        if (length1 == 0)
            return false;

        if (str1.charAt(length1 - 1) == str2.charAt(length2 - 1))
            return subsequenceRecursive(str1, str2, length1 - 1, length2 - 1);
        else
            return subsequenceRecursive(str1, str2, length1 - 1, length2);

    }

    public static boolean subsequence(String str1, String str2) {

        int i = 0;
        int j = 0;

        while (i < str1.length() - 1) {
            if (str1.charAt(i) == str2.charAt(j)) {
                System.out.println(str2.charAt(j));
                i++;
                j++;
            } else {
                i++;
            }
        }

        return j == str2.length();

    }

    public static String pallindrome(String str) {

        int first = 0;
        int last = str.length() - 1;

        while (first < last) {
            if (str.charAt(first) != str.charAt(last))
                return "NO";

            first++;
            last--;
        }

        return "YES";
    }

}