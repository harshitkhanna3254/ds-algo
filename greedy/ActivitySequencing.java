package greedy;

import java.util.Arrays;

public class ActivitySequencing {


    private static Pair[] getMaxActivityCount(Pair[] pairArray) {

        //sort activity pairs by increasing order of finish time
        Arrays.sort(pairArray, new MyCmpAsc());

        Pair[] result = new Pair[pairArray.length];
        result[0] = pairArray[0];

        int resCount = 0;

        for (int i = 1; i < pairArray.length; i++) {
            if (pairArray[i].getX() > result[resCount].getY()) {
                resCount++;
                result[resCount] = pairArray[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Pair[] pairArray = new Pair[4];
        pairArray[0] = new Pair(3, 8);
        pairArray[1] = new Pair(2, 4);
        pairArray[2] = new Pair(1, 3);
        pairArray[3] = new Pair(10, 11);

        Pair[] result = getMaxActivityCount(pairArray);
        System.out.println(Arrays.toString(result));

    }
}
