package mathematics;
import java.math.*;

public class Gcd {

    public static void main(String[] args) {
        int num1 = 105;
        int num2 = 350;

        Gcd gcd = new Gcd();
        System.out.println(gcd.getGcd(num1, num2));
        System.out.println(gcd.getEuclidGcd(num1, num2));


    }

    int getGcd(int num1, int num2) {
        int smol = Math.min(num1, num2);

        int gcd = 1;
        for (int i = 1; i <= smol; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }

        return gcd;
    }

    int getEuclidGcd(int num1, int num2) {
        return num2 == 0 ? num1 : getEuclidGcd(num2, num1 % num2);
    }

}
