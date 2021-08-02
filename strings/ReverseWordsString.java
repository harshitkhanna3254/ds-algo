package strings;

import java.util.Arrays;

public class ReverseWordsString {
    public static void main(String[] args) {
        String str = "Hello my name is Harshit";

        reverseWords(str);
    }

    public static void reverseWords(String str) {

        char[] char_array = str.toCharArray();

        int start = 0;
        int end = 0;
        while (end != char_array.length - 1) {
            if (char_array[end] == ' ') {
                // reverse word till space
                reverse(char_array, start, end - 1);
                start = end + 1;
            }
            end++;
        }

        reverse(char_array, start, char_array.length - 1);
        reverse(char_array, 0, char_array.length - 1);

        System.out.println(Arrays.toString(char_array));
    }

    public static void reverse(char[] char_array, int low, int high) {

        while (low < high) {
            char temp_char = char_array[low];
            char_array[low] = char_array[high];
            char_array[high] = temp_char;

            low++;
            high--;
        }
    }
}
