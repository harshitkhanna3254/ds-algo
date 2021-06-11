package concepts;

public class Palindrome {
    public static void main(String[] args) {
        String str = "a";

        int start = 0;
        int end = str.length() - 1;

        System.out.println(palindrome(str, start, end));

    }

    static Boolean palindrome(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return palindrome(str, start + 1, end - 1);
    }
}
