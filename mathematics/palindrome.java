package mathematics;

class Palindrome {
    public static void main(String[] args) {
        int num = 2112;
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalinStr(num));
        System.out.println(palindrome.isPalinRev(num));

    }

    Boolean isPalinStr(int num) {

        String str = Integer.toString(num);

        for (int i = 0; i < (str.length() + 1) / 2; i++) {
            int j = str.length() - i - 1;

            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    Boolean isPalinRev(int num) {

        int origNum = num;
        int rev = 0;

        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;

            num = num / 10;
        }

        return origNum == rev;
    }
}
