package arrays;

public class maxConsecutive1s {
    public static void main(String[] args) {

        int[] arr = { 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1 };

        int[] arr2 = { 1, 1, 1, 1, 1 };

        int[] arr3 = { 0, 1, 1, 0, 1, 1, 1 };

        int res = -1;

        res = max1(arr3);
        System.out.println(res);

        res = max1(arr3);
        System.out.println(res);

    }

    static int max1Method2(int[] arr) {

        int res = 0;

        int curr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                curr = 0;
            } else {
                curr++;
                res = Math.max(curr, res);
            }
        }

        return res;
    }

    static int max1(int[] arr) {

        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            while (i != arr.length && arr[i] == 1) {
                i++;
                temp++;
            }
            res = Math.max(temp, res);
        }

        return res;
    }
}
