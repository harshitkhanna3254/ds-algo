package concepts;

public class SumDigits {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(sum(num));

    }

    static int sum(int num) {

        return num / 10 == 0 ? num : num % 10 + sum(num / 10);
    }
}
