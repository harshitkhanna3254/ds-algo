package greedy;

import java.util.Arrays;

public class JobSequencing {

    private static int scheduleJobs(Pair[] jobs) {

        Arrays.sort(jobs, new MyCmpDec());

        boolean[] isJobScheduled = new boolean[jobs.length];

        int res = 0;

        isJobScheduled[jobs[0].getX() - 1] = true;
        res = res + jobs[0].getY();

        for (int i = 1; i < jobs.length; i++) {

            int reverseCount = 0;

            while (reverseCount != i - 1) {
                if (isJobScheduled[jobs[i].getX() - 1 - reverseCount] == false) {
                    isJobScheduled[jobs[i].getX() - 1 - reverseCount] = true;
                    res = res + jobs[i].getY();
                }
                reverseCount--;
            }
        }

        return res;
    }


    public static void main(String[] args) {
        Pair[] jobs = new Pair[5];
//        jobs[0] = new Pair(2, 100);
//        jobs[1] = new Pair(1, 50);
//        jobs[2] = new Pair(2, 10);
//        jobs[3] = new Pair(1, 20);
//        jobs[4] = new Pair(3, 30);

        jobs[0] = new Pair(2, 100);
        jobs[1] = new Pair(1, 19);
        jobs[2] = new Pair(2, 27);
        jobs[3] = new Pair(1, 25);
        jobs[4] = new Pair(3, 15);


        int profit = scheduleJobs(jobs);
        System.out.println("Total profit is: " + profit);
    }
}
