package arrays;

public class SecondLargestElement {

    public static void main(String[] args) {
        int x = 3;
        int[] arr = { 2, 6, 8, 33, 6, 54, 83, 3, 7, 90, 32, 68, 38, 4 };

        int[] arr1 = { 10, 10, 10 };

        System.out.println(secLargest(x, arr));
    }

    static int secLargest(int x, int[] arr) {

        int max = arr[0];
        int second = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                second = max;
                max = arr[i];
            } else if(arr[i] < max) {
                second = Math.max(second, arr[i]);
            }
        }
        System.out.println(max + " " + second);

        return second;
    }

}
