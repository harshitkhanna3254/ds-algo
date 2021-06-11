package concepts;

public class SumN {
    public static void main(String[] args) {
        int num = 5;

        System.out.println(sumN(num));

    }

    static int sumN(int num) {

        return num == 1 ? 1 : num + sumN(num - 1);
    }
}
