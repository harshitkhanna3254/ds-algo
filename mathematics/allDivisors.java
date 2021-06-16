package mathematics;

import java.util.ArrayList;
import java.util.List;

public class allDivisors {
    public static void main(String[] args) {
        int num = 15;

        System.out.println(allDivisors(num));

    }

    static List<Integer> allDivisors(int num) {

        List<Integer> arr = new ArrayList<>();

        int i = 1;
        for (i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                arr.add(i);
            }
        }

        for (; i >= 1; i--) {
            if (num % i == 0 && i != Math.sqrt(num)) {
                arr.add(num / i);
            }
        }

        return arr;
    }
}
