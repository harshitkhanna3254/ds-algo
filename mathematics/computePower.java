package mathematics;

public class computePower {
    public static void main(String[] args) {
        int x = 3;
        int n = 5;

        System.out.println(computePower(x, n));

    }

    static int computePower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int temp = computePower(x, n / 2);
        temp = temp * temp;

        if (n % 2 == 0) {
            return temp;
        } else {
            return x * temp;
        }

    }

    static int iterativePower(int x, int n) {

        while (n > 0) {
            if (n % 2 == 0) {

            } else {

            }
            n = n / 2;
        }

        return 1;
    }
}
