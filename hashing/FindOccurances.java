package hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindOccurances {
    public static void main(String[] args) {
        int[] arr = { 10, 12, 10, 15, 10, 20, 12, 12 };

        findOccurances(arr);
    }

    private static void findOccurances(int[] arr) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // for (Integer x : arr) {
        // if (hashMap.containsKey(x))
        // hashMap.put(x, hashMap.get(x) + 1);
        // else
        // hashMap.put(x, 1);
        // }

        for (Integer x : arr) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }

        // printMapUsingEntrySet(hashMap);
        // printMapUsingIterator(hashMap);
        printMapUsingLambdas(hashMap);

    }

    /* ----------------------------- Using Entry Set ---------------------------- */
    public static void printMapUsingEntrySet(HashMap<Integer, Integer> hashMap) {

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.toString());
        }
    }

    /* ----------------------------- Using Iterator ----------------------------- */
    private static void printMapUsingIterator(HashMap<Integer, Integer> hashMap) {

        Iterator<Map.Entry<Integer, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            System.out.println(entry.toString());
        }
    }

    private static void printMapUsingLambdas(HashMap<Integer, Integer> hashMap) {

        hashMap.forEach((key, value) -> {
            System.out.println(key + " :: " + value);
        });
    }

}
