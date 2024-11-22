package Advanced;

import java.util.SortedMap;
import java.util.TreeMap;

public class Pro_seventeen {
    public static void main(String[] args) {
        // Create a SortedMap using TreeMap
        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        // Add key-value pairs to the map
        sortedMap.put(3, "Apple");
        sortedMap.put(1, "Orange");
        sortedMap.put(4, "Banana");
        sortedMap.put(2, "Grapes");

        // Display the map (keys will be in sorted order)
        System.out.println("Sorted Map: " + sortedMap);

        // Retrieve the first and last keys
        System.out.println("First Key: " + sortedMap.firstKey());
        System.out.println("Last Key: " + sortedMap.lastKey());

        // Get a subMap (keys between 2 and 4, excluding 4)
        SortedMap<Integer, String> subMap = sortedMap.subMap(2, 4);
        System.out.println("SubMap (keys 2 to 4): " + subMap);

        // Get a headMap (keys less than 3)
        SortedMap<Integer, String> headMap = sortedMap.headMap(3);
        System.out.println("HeadMap (keys less than 3): " + headMap);

        // Get a tailMap (keys greater than or equal to 3)
        SortedMap<Integer, String> tailMap = sortedMap.tailMap(3);
        System.out.println("TailMap (keys >= 3): " + tailMap);

        // Check if a key exists
        int keyToCheck = 2;
        if (sortedMap.containsKey(keyToCheck)) {
            System.out.println("Key " + keyToCheck + " exists in the map with value: " + sortedMap.get(keyToCheck));
        } else {
            System.out.println("Key " + keyToCheck + " does not exist in the map.");
        }
    }
}

