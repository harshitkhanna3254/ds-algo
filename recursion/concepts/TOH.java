package concepts;

public class TOH {
    public static void main(String[] args) {
        int n = 2;
        toh(n, 'A', 'B', 'C');
    }

    static void toh(int n, char a, char b, char c) {

        if (n == 0) {
            return;
        }

        toh(n - 1, a, c, b);
        System.out.println("Move disk " + n + " from " + a + " to " + c);
        toh(n - 1, b, a, c);
    }
}
