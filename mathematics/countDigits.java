package mathematics;

class CountDigits {
    public static void main(String[] args) {
        int num = 111;
        
        CountDigits countDigits = new CountDigits();

        System.out.println(countDigits.iterative(num));
        System.out.println(countDigits.recursive(num));
        System.out.println(countDigits.logarithmic(num));

    }

    int iterative(int num) {
        int count = 0;

        while (num >= 1) {
            num = num/10;
            count++;
        }
        return count;
    }

    int recursive(int num) {
        if (num == 0) return 0;

        return recursive(num/10) + 1;
    }

    double logarithmic(int num) {

        double x = Math.floor(Math.log10( Double.valueOf(num) ) + 1);

        return x;
    }
}