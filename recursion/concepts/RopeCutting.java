package concepts;

public class RopeCutting {
    public static void main(String[] args) {
        int num = 5;
        int a = 2;
        int b = 5;
        int c = 1;

        System.out.println(cutRope(num, a, b, c));
    }

    // cut rope in maximum number of pieces such that the pieces are of length in
    // the set {a,b,c} only

    static int cutRope(int num, int a, int b, int c) {

        if (num < 0)
            return -1;

        if (num == 0)
            return 0;

        int res = Math.max(Math.max(cutRope(num - a, a, b, c), cutRope(num - b, a, b, c)), cutRope(num - c, a, b, c));

        if (res == -1)
            return -1;

        return res + 1;
    }
}
