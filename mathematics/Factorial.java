package mathematics;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        Factorial factorial = new Factorial();
        System.out.println(factorial.factItr(num));
        System.out.println(factorial.factRec(num));

    }

    int factItr(int num) {

        int fact = 1;

        for (int i = num; i > 1; i--) {
            fact = fact * i;
        }

        return fact;
    }

    int factRec(int num) {
        if(num == 1) return 1;

        return factRec(num-1)*num;
    }
}
