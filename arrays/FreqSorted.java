package arrays;

public class FreqSorted {
    public static void main(String[] args) {

        int[] arr = { 10, 10, 10, 20, 30, 30 };

        int[] arr1 = { 40, 50, 50, 50 };

        int[] arr2 = { 10, 10, 10, 30, 30, 40 };

        freqSorted(arr1);
        System.out.println("---------------------------");
        freqSorted(arr2);
    }

    static void freqSorted(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            System.out.print(arr[i] + "  ");
            while (i != arr.length - 1 && arr[i + 1] == arr[i]) {
                i++;
                count++;
            }
            System.out.println(count);
        }

    }
}
