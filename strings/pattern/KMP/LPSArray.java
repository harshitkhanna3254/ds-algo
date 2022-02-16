package strings.pattern.KMP;


// string = "abacabad"
// lpsArr = {0, 0, 1, 0, 1, 2, 3, 0 }

// string = "abbabb"
// lpsArr = {0, 0, 0, 1, 2, 3}

public class LPSArray {
    public static void main(String[] args) {

        String str = "abacabad";
        lpsArray(str);
    }

    public static int[] lpsArray(String str) {

        int[] arr = { 0, 1, 4 };
        return arr;

    }
}
