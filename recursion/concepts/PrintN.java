package recursion.concepts;

public class PrintN {
    public static void main(String[] args) {
        int num = 5;
        // oneToN(num);
        // nToOne(num);
        // nToOneTail(num, 5);
        // System.out.println(fact(num));

        System.out.println(factTail(num, 1));

    }

    static int factTail(int num, int k) {

        if (num == 0 || num == 1)
            return k;

        return factTail(num - 1, k * num);
    }

    static int fact(int num) {

        if (num == 0 || num == 1)
            return 1;

        return num * fact(num - 1);
    }

    static void nToOneTail(int num, int k) {

        if (num == 0)
            return;

        System.out.println(k);

        nToOneTail(num - 1, k - 1);
    }

    static void oneToN(int num) {

        if (num == 0)
            return;

        oneToN(num - 1);

        System.out.println(num);
    }

    static void nToOne(int num) {

        if (num == 0)
            return;

        System.out.println(num);

        nToOne(num - 1);
    }
}
