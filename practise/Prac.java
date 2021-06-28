package practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Prac {
    public static void main(String[] args) {

        Integer[] arr = { 7, 4, 1, 2, 6, 9, 7, 5, 8, 3 };

        pracArr(arr);

    }

    static void pracArr(Integer[] arr) {

        Arrays.sort(arr, Collections.reverseOrder());

        Arrays.sort(arr, new MyComp());

        System.out.println(Arrays.toString(arr));

    }

}

class MyComp implements Comparator<Integer> {

    public int compare(Integer i1, Integer i2) {

        return i1 % 2 - i2 % 2;
    }

}
