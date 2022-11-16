package practise;

public class SameHashcode {
    public static void main(String[] args) {
        String test1 = "abyz";
        int hash1 = test1.hashCode();
        System.out.println(test1 + " hash is " + hash1);
        String test2 = "abz";
        test2 = test2 + (char) ((int) ('z') - 31);
        int hash2 = test2.hashCode();
        System.out.println(test2 + " hash is " + hash2);

        SameHashcode ssh = new SameHashcode();
        ssh.printHashValues(test1);
    }

    private void printHashValues(String str) {
        System.out.println("Original: " + str + " hash is " + str.hashCode());
        final char c[] = str.toCharArray();
        int asciiMin = (int) '!';
        int asciiMax = (int) '~';
        for (int delta2 = -3; delta2 <= +3; delta2++) {
            if (delta2 != 0) {
                char orig2 = c[str.length() - 2];
                int mod2 = orig2 + delta2;
                boolean isInRange2 = asciiMin <= mod2 && mod2 <= asciiMax;
                if (isInRange2) {
                    char orig1 = c[str.length() - 1];
                    int delta1 = delta2 * 31;
                    int mod1 = orig1 - delta1;
                    boolean isInRange1 = asciiMin <= mod1 && mod1 <= asciiMax;
                    if (isInRange1) {
                        char[] modc = str.toCharArray();
                        modc[str.length() - 2] = (char) mod2;
                        modc[str.length() - 1] = (char) mod1;
                        String str2 = new String(modc);
                        System.out.println(str2 + " hash is " + str2.hashCode());
                    }
                }
            }
        }
    }
}
