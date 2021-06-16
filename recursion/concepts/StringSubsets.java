package recursion.concepts;

public class StringSubsets {
    public static void main(String[] args) {
        String str = "ABC";
        subsets(str, "", 0);
    }

    static void subsets(String str, String current, int i) {

        if (i == str.length()) {
            if (current.equals("")) {
                System.out.print("empty ");
                return;
            }
            System.out.print(current + " ");
            return;
        }

        subsets(str, current, i + 1);
        subsets(str, current + str.charAt(i), i + 1);
    }
}
