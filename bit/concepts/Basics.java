package bit.concepts;

public class Basics {

    public static void main(String[] args) {
        final int num = 5;

        System.out.println(not(num));

    }

    static int not(int num) {
        return ~num;
    }
}
