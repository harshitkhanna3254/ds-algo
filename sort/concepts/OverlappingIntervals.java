package sort.concepts;

import java.util.Arrays;
import java.util.Comparator;

public class OverlappingIntervals {
    public static void main(String[] args) {

        // I/P: { {1,3}, {2,4}, {5,7}, {6,8} }
        // O/P: { {1,4}, {5,8} }

        Interval[] arr = { new Interval(5, 10), new Interval(3, 15), new Interval(18, 30), new Interval(2, 7) };

        System.out.println("Input array : " + Arrays.toString(arr));

        int res = combineOverlappingIntervals(arr);

        System.out.println("Output array : " + Arrays.toString(arr) + " with index = " + res);
    }

    public static int combineOverlappingIntervals(Interval[] arr) {

        Arrays.sort(arr, new CustomComparator());

        int res = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].start < arr[res].end) {
                arr[res].end = arr[i].end;
            } else {
                res++;
                arr[res] = arr[i];
            }
        }
        return res;
    }

}

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "{ " + start + ", " + end + " }";
    }
}

class CustomComparator implements Comparator<Interval> {
    @Override
    public int compare(Interval o1, Interval o2) {
        // TODO Auto-generated method stub
        return o1.start - o2.start;
    }
}
