package search;

public class Median {
    public static void main(String[] args) {

        int[] arr1 = { 10, 20, 30, 40, 50 };
        int[] arr2 = { 5, 15, 25, 35, 45, 55, 65, 75, 85 };

        // int[] arr1 = { 10, 20, 30, 40, 50 };
        // int[] arr2 = { 5, 15, 25, 35, 45 };

        medianOfSorted(arr1, arr2);

    }

    static void medianOfSorted(int[] arr1, int[] arr2) {
        int[] smallA;
        int[] bigA;

        if (arr1.length < arr2.length) {
            smallA = arr1;
            bigA = arr2;
        } else {
            smallA = arr2;
            bigA = arr1;
        }

        int low = 0;
        int high = smallA.length;

        while (low <= high) {
            int i1 = (low + high) / 2;
            int i2 = (smallA.length + bigA.length + 1) / 2 - i1;

            int max1 = i1 == 0 ? Integer.MIN_VALUE : smallA[i1 - 1];
            int min1 = i1 == smallA.length ? Integer.MAX_VALUE : smallA[i1];
            int max2 = i2 == 0 ? Integer.MIN_VALUE : bigA[i2 - 1];
            int min2 = i2 == bigA.length ? Integer.MAX_VALUE : bigA[i2];

            if (max1 <= min2 && max2 <= min1) {
                if ((smallA.length + bigA.length) % 2 == 0) {
                    int maxLeft = Math.max(max1, max2);
                    int minRight = Math.min(min1, min2);
                    double res = (double) (maxLeft + minRight) / 2;
                    System.out.println("Median is (" + maxLeft + " + " + minRight + ") / 2 ==> " + res);
                    break;
                } else {
                    int maxLeft = Math.max(max1, max2);
                    System.out.println("Median is " + maxLeft);
                    break;
                }
            } else if (max1 > min2) {
                high = i1 - 1;
            } else {
                low = i1 + 1;
            }

        }

    }
}
