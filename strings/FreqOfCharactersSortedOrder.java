package strings;

public class FreqOfCharactersSortedOrder {
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        printFreq(str);
    }

    public static void printFreq(String str) {
        int[] freqArr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            freqArr[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] != 0)
                System.out.println("Freq of " + (char) (i + 'a') + " is " + freqArr[i]);
        }

    }
}
