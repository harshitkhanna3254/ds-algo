package dynamic_programming;

public class PrintSubseq {

    static int count = 0;

    private static void printSub(String s1, int m, String temp) {

        if (s1.length() == m) {
            count++;
            System.out.println(temp);
            return;
        }


        printSub(s1, m + 1, temp + s1.charAt(m));
        printSub(s1, m + 1, temp);
    }


    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        printSub(s1, 0, "");
        System.out.println(count);
    }

}
