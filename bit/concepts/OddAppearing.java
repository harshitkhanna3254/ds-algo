package bit.concepts;

public class OddAppearing {

    // 2 odd appearing numbers. Print those 2 numbers,

    public static void main(String[] args) {

        int[] arr = { 3, 4, 3, 4, 8, 4, 4, 32, 7, 7 };

        oddAppNumbers(arr);

    }

    static void oddAppNumbers(int[] arr) {

        int XOR = 0;

        for (int i = 0; i < arr.length; i++) {
            XOR = XOR ^ arr[i];
        }

        int oneSetBitNumber = XOR & ~(XOR - 1);

        int res1 = 0;
        int res2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & oneSetBitNumber) != 0) {
                res1 = res1 ^ arr[i];
            } else {
                res2 = res2 ^ arr[i];
            }
        }

        System.out.println(res1 + " and " + res2);

    }
}
