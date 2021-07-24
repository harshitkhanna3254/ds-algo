package strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        System.out.println(checkIfPalindrome(str));

    }

    /* ---------------------- Efficient: 2 pointer approach --------------------- */

    public static boolean checkIfPalindrome(String str) {

        StringBuilder stringBuilder = new StringBuilder(str);
        return str.equals(stringBuilder.toString());
    }
}
