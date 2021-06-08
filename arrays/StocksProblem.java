package arrays;

class StocksProblem {
    public static void main(String[] args) {

        int[] arr = { 2, 6, 8, 33, 6, 54, 83, 3, 7, 90 };

        int[] arr1 = { 10, 20, 0, 0, 30, 0, 40, 0, 40, 0 };

        int[] arr2 = { 1, 5, 3, 8, 12 };

        int[] arr3 = { 1, 5, 3, 1, 2, 8 };

        int res = stonks(arr3);
        System.out.println(res);

    }

    static int stonks(int[] arr) {

        int profit = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[i - 1]) {
                profit += arr[i] - arr[i - 1];
            }
        }

        return profit;
    }
}