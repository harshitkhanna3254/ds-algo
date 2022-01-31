package practise;

import java.util.HashMap;

public class Prac {
    public static void main(String[] args) {

        // String str = "ABCDCBA";
        // String str = "ABBA";
        // String str = "geeks";

        // subsequence
        // String str1 = "ABCDEF";
        // String str2 = "AED";
        // String str1 = "ABCDEF";
        // String str2 = "ACF";

        // anagram
        String str1 = "silent";
        String str2 = "listen";
        // String str1 = "aaacb";
        // String str2 = "baaca";

        // System.out.println(pallindrome(str));
        // System.out.println(subsequence(str1, str2));
        // System.out.println(subsequenceRecursive(str1, str2, str1.length(),
        // str2.length()));
        System.out.println(anagram(str1, str2));

    }

    public static boolean anagram(String str1, String str2) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            hashMap.put(str1.charAt(i), hashMap.getOrDefault(str1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < str2.length(); i++) {

            char currentCharacter = str2.charAt(i);

            if (!hashMap.containsKey(currentCharacter)) {
                return false;
            }

            int frequency = hashMap.get(currentCharacter);

            if (frequency > 1)
                hashMap.put(currentCharacter, frequency - 1);
            else
                hashMap.remove(currentCharacter);
        }

        if (hashMap.size() > 0)
            return false;

        return true;
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