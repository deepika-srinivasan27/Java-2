package Advanced;

import java.util.Map;
import java.util.TreeMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Pro_fourteen {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        Map<String, String> countryCapitals = new LinkedHashMap<>();

        // Add elements to the map
        countryCapitals.put("USA", "Washington, D.C.");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("Germany", "Berlin");
        countryCapitals.put("Japan", "Tokyo");

        // Display the map (insertion order is preserved)
        System.out.println("Country and their Capitals (Insertion Order):");
        for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Access a specific capital
        String country = "India";
        System.out.println("\nThe capital of " + country + " is " + countryCapitals.get(country));

        // Remove an entry
        countryCapitals.remove("Germany");
        System.out.println("\nAfter removing Germany:");
        for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Check if a key or value exists
        System.out.println("\nDoes the map contain Japan? " + countryCapitals.containsKey("Japan"));
        System.out.println("Does the map contain Berlin? " + countryCapitals.containsValue("Berlin"));

        // Clear the map
        countryCapitals.clear();
        System.out.println("\nMap after clearing: " + countryCapitals);
    }
}

