package arrays;

import java.util.Arrays;

public class DeleteOperation {
    
    public static void main(String[] args) {
        int x = 3;
        int[] arr = {2,6,8,33,6,54,83,3,7,90};

        System.out.println(Arrays.toString( deleteElement(x, arr)) );

    }

    static int[] deleteElement(int x, int[] arr) {

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == x) {
                for(int j=i; j< arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                break;
            }
        }
        
       return arr;
    }

}
