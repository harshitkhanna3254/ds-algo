package practise;

import java.util.Arrays;
import java.util.HashMap;

import javax.print.DocFlavor.CHAR_ARRAY;

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
        // String str1 = "silent";
        // String str2 = "listen";
        // String str1 = "aaacb";
        // String str2 = "baaca";

        // leftmost repeating character
        // String str = "abbcc";
        // String str = "geeksforgeeks";
        // String str = "abcd";
        // String str = "abccbd";

        //reverse
        String str = "My Name is HK";

        // System.out.println(pallindrome(str));
        // System.out.println(subsequence(str1, str2));
        // System.out.println(subsequenceRecursive(str1, str2, str1.length(),
        // str2.length()));
        // System.out.println(anagram(str1, str2));
        // System.out.println(leftmostRepeatingCharacter(str));
        // System.out.println(leftmostRepeatingCharacterEfficientV1(str));
        reverseString(str);

    }

    public static void reverseString(String str) {

        String[] strArray = str.split(" ");

        if (strArray.length == 1) {
            System.out.println(str);
            return;
        }




    }

    public static int leftmostRepeatingCharacterEfficientV1(String str) {
        int[] indexArray = new int[256];
        Arrays.fill(indexArray, -1);

        int resultIndex = Integer.MAX_VALUE;

        for (int i = 0; i < str.length(); i++) {
            if (indexArray[str.charAt(i)] == -1) {
                indexArray[str.charAt(i)] = i;
            } else {
                resultIndex = Math.min(indexArray[str.charAt(i)], resultIndex);
            }
        }

        return resultIndex == Integer.MAX_VALUE ? -1 : resultIndex;
    }

    public static int leftmostRepeatingCharacter(String str) {
        int[] countArray = new int[256];

        for (int i = 0; i < str.length(); i++) {
            countArray[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (countArray[str.charAt(i)] > 1) {
                return i;
            }
        }

        return -1;
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