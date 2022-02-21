package strings;

public class CheckRotation {
    public static void main(String[] args) {

        String str1 = "ABCABDE";
        String str2 = "CABDEAB";

        // String str1 = "ABCABDC";
        // String str2 = "DCABCMB";

        Boolean b = checkRot(str1, str2);
        System.out.println(b);
    }

    public static boolean checkRot(String str1, String str2) {

        String temp = str1 + str1;

        if (temp.indexOf(str2) >= 0) {
            return true;
        }

        return false;
    }
}
