package mathematics;

import java.util.ArrayList;
import java.util.List;

public class Lcm {
    
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 7;

        Lcm lcm = new Lcm();
        System.out.println(lcm.getLcm(num1, num2));

    }

    List<Integer> getLcm(int a, int b) {
       int max = Math.max(a, b);
        List<Integer> arr = new ArrayList<>();
        for(int i = 2; i<= max; i++) {
            while(a % i == 0 || b % i == 0){
                if(a % i == 0){
                    a = a/i;
                } 
                if (b % i == 0) {
                    b = b/i;
                }
                arr.add(i);
            }
        }
        return arr;
    }

}
