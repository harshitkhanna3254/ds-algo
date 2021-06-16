package mathematics;

public class computePower {
    public static void main(String[] args) {
        int x = 3;
        int n = 5;

        System.out.println(computePower(x, n));

    }

    static int computePower(int x, int n) {
        if (n == 1) {
            return x;
        }

        return n % 2 == 0 ? computePower(x, n / 2) * computePower(x, n / 2) : computePower(x, n - 1) * x;
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
