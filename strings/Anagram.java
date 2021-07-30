package strings;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // String str1 = "aabca";
        // String str2 = "acaba";

        // String str1 = "aab";
        // String str2 = "bab";
        System.out.println(checkAnagramArr(str1, str2));

        System.out.println(checkAnagramHash(str1, str2));
    }


    /* ------------------ If strings not of same length, false; ----------------- */
    /* --- Make index array and store count of characters. str1++ and str2--; --- */
    /* ---------------- Traverse, if any element non zero, false; --------------- */
    public static boolean checkAnagramArr(String str1, String str2) {

        return false;
    }

    public static boolean checkAnagramHash(String str1, String str2) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            hashMap.put(str1.charAt(i), hashMap.getOrDefault(str1.charAt(i), 0) + 1);
        }
        System.out.println(hashMap);

        for (int i = 0; i < str2.length(); i++) {
            char current_character = str2.charAt(i);

            if (!hashMap.containsKey(current_character)) {
                System.out.println(hashMap);
                return false;
            }

            if (hashMap.get(current_character) == 1)
                hashMap.remove(current_character);
            else
                hashMap.put(current_character, hashMap.get(current_character) - 1);
        }
        System.out.println(hashMap);

        return hashMap.size() == 0;
    }
}
