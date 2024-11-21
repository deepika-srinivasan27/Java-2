package Advanced;

import java.util.SortedMap;
import java.util.TreeMap;

public class Pro_fifteen {
    public static void main(String[] args) {
        // Create a SortedMap using TreeMap
        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        // Adding elements to the SortedMap
        sortedMap.put(4, "Apple");
        sortedMap.put(2, "Banana");
        sortedMap.put(5, "Cherry");
        sortedMap.put(1, "Date");
        sortedMap.put(3, "Elderberry");

        // Displaying the SortedMap
        System.out.println("SortedMap: " + sortedMap);

        // Accessing the first and last keys
        System.out.println("First Key: " + sortedMap.firstKey());
        System.out.println("Last Key: " + sortedMap.lastKey());

        // Getting a sub-map view
        SortedMap<Integer, String> subMap = sortedMap.subMap(2, 5);
        System.out.println("SubMap (2 to 5): " + subMap);

        // Getting the headMap and tailMap
        System.out.println("HeadMap (up to 3): " + sortedMap.headMap(3));
        System.out.println("TailMap (from 3): " + sortedMap.tailMap(3));

        // Iterating over the SortedMap
        System.out.println("Iterating over the SortedMap:");
        for (var entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

