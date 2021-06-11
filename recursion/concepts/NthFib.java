package concepts;

public class NthFib {
    public static void main(String[] args) {
        final int num = 8;

        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 .....

        System.out.println(nthF(num));
    }

    static int nthF(int num) {

        if (num == 0 || num == 1)
            return 1;

        return nthF(num - 1) + nthF(num - 2);
    }
}
