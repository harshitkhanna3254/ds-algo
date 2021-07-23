package hashing;

import java.util.HashMap;

public class CountDistinctElementsInGivenSizeWindow {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 20, 10, 30, 40, 10 };
        int window_size = 4;

        printDistinctElementsInWindow(arr, window_size);

    }

    private static void printDistinctElementsInWindow(int[] arr, int window_size) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int start = 0;
        int end = window_size - 1;

        for (int i = start; i <= end; i++)
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);

        printMap(hashMap);

        for (int i = window_size; i < arr.length; i++) {

            if (hashMap.get(arr[i - window_size]) > 1)
                hashMap.put(arr[i - window_size], hashMap.get(arr[i - window_size]) - 1);
            else
                hashMap.remove(arr[i - window_size]);

            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);

            printMap(hashMap);
        }

    }

    public static void printMap(HashMap<Integer, Integer> hashMap) {
        System.out.println("-----");
        System.out.println("hashmap");
        hashMap.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
        System.out.println("-----");
        System.out.println("size of map: " + hashMap.size() + " ");
    }
}
