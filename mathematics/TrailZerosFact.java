package mathematics;

public class TrailZerosFact {

    public static void main(String[] args) {
        int num = 100;
        TrailZerosFact trailZerosFact = new TrailZerosFact();
        
        System.out.println(trailZerosFact.tzEff(num));


        // Factorial factorial = new Factorial();
        // int numFact = factorial.factItr(num); //fact of the nnum
        // System.out.println(trailZerosFact.tzItr(numFact));

    }

    int tzItr(int numFact) { // Not a good solution as for slightly larger values i.e for fact of 20, overflow issues, will break. TC is theta(n)

        int count = 0;

        while(numFact % 10 == 0) {
            count++;

            numFact = numFact / 10;
        }

        return count;
    }


    //just need to calc number of 2s and 5s in the prime factorization of the num. Actually, just the 5s as 2's will alawys be less.
    int tzEff(int num) {

        int count = 0;

        for (int i = 5; i <= num; i = i * 5) {
            count = count + num/i;
        }

        return count;
    }
}
