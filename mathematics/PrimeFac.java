package mathematics;

import java.util.ArrayList;
import java.util.List;

public class PrimeFac {

    public static void main(String[] args) {
        int num = 13;

        PrimeFac primeFac = new PrimeFac();
        System.out.println(primeFac.primeFacNaive(num));

    }

    List<Integer> primeFacNaive(int num) {

        List<Integer> arr = new ArrayList<>();

        if (num < 1) {
            return arr;
        }

        while (num % 2 == 0) {
            arr.add(2);
            num = num / 2;
        }

        while (num % 3 == 0) {
            arr.add(3);
            num = num / 3;
        }

        for (int i = 5; i <= Math.sqrt(num); i = i + 6) {
            while (num % i == 0) {
                num = num / i;
                arr.add(i);
            }

            while (num % (i + 2) == 0) {
                num = num / (i + 2);
                arr.add(i + 2);
            }
        }
        if (num > 3)
            arr.add(num);
        return arr;
    }
}
