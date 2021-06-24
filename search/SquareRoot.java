package search;

public class SquareRoot {
    public static void main(String[] args) {

        int x = 39;

        for (int i = 1; i < x; i++) {

            System.out.println(srootMyImpl(i));
            System.out.println(srootActual(i));
        }

    }

    static int srootActual(int x) {

        int start = 0;
        int end = x;
        int answer = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            int mySq = mid * mid;

            if (mySq == x) {
                return mid;
            }

            if (x > mySq) {
                start = mid + 1;
                answer = mid;
            } else {
                end = mid - 1;
            }
        }

        return answer;
    }

    static int srootMyImpl(int x) {

        int start = 0;

        int end = x;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid * mid <= x && (mid + 1) * (mid + 1) > x) {
                return mid;
            }

            if (x > mid * mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
