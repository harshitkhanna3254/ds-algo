package mathematics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sieveOfEratosthenes {
    public static void main(String[] args) {
        int num = 15;

        sieve(num);

    }

    static List<Integer> sieve(int num) {

        List<Integer> arr = new ArrayList<>(Collections.nCopies(num+1, 1));
        arr.set(0, 0);
        arr.set(1, 0);

        for(int i=2; i< Math.sqrt(num); i++ ){
            if(arr.get(i) == 1){
                for(int j=2; j*i < num; j++) {
                    arr.set(i*j, 0);
                }
            }
        }

        for(int i=2; i<arr.size(); i++) {
            if(arr.get(i) == 1){
                System.out.print(i + ", ");
            }
        }

        return arr;
    }


}
