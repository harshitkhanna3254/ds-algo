package sort.concepts;

public class IntersectionSorted {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 20, 40, 60 };
        int[] arr2 = { 2, 20, 20, 20 };

        intersection(arr1, arr2);

    }

    static void intersection(int arr1[], int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = 0;
        int j = 0;

        int temp = -1;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] == arr2[j]) {
                if (arr1[i] != temp) {
                    System.out.println(arr1[i]);
                    temp = arr1[i];
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            }
        }
    }
}
