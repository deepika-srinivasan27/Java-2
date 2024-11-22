package Advanced;

import java.util.SortedMap;
import java.util.TreeMap;

public class Pro_eighteen {
    public static void main(String[] args) {
        // Create a SortedMap to store names and ages
        SortedMap<String, Integer> nameAgeMap = new TreeMap<>();

        // Add entries to the SortedMap
        nameAgeMap.put("Alice", 30);
        nameAgeMap.put("Bob", 25);
        nameAgeMap.put("Charlie", 35);
        nameAgeMap.put("Diana", 28);

        // Print the SortedMap
        System.out.println("Sorted Map (Names in Alphabetical Order):");
        System.out.println(nameAgeMap);

        // Access specific entries using keys
        System.out.println("\nAge of Charlie: " + nameAgeMap.get("Charlie"));

        // Retrieve and display the first and last entries
        System.out.println("First Entry: " + nameAgeMap.firstKey() + " -> " + nameAgeMap.get(nameAgeMap.firstKey()));
        System.out.println("Last Entry: " + nameAgeMap.lastKey() + " -> " + nameAgeMap.get(nameAgeMap.lastKey()));

        // Iterate over the map and print each entry
        System.out.println("\nIterating through the SortedMap:");
        for (var entry : nameAgeMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // Remove an entry and display the updated map
        nameAgeMap.remove("Bob");
        System.out.println("\nSorted Map after removing 'Bob':");
        System.out.println(nameAgeMap);

        // Check if a name exists in the map
        String nameToCheck = "Alice";
        if (nameAgeMap.containsKey(nameToCheck)) {
            System.out.println("\n" + nameToCheck + " is present with age: " + nameAgeMap.get(nameToCheck));
        } else {
            System.out.println("\n" + nameToCheck + " is not present in the map.");
        }
    }
}

