package Advanced;

import java.util.HashMap;
import java.util.Map;

public class Pro_thirteen {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> fruitPrices = new HashMap<>();

        // Add elements to the map
        fruitPrices.put("Apple", 150);
        fruitPrices.put("Banana", 40);
        fruitPrices.put("Cherry", 200);
        fruitPrices.put("Date", 120);

        // Display the map
        System.out.println("Fruit prices: " + fruitPrices);

        // Accessing a value
        String fruit = "Apple";
        if (fruitPrices.containsKey(fruit)) {
            System.out.println(fruit + " costs: " + fruitPrices.get(fruit));
        } else {
            System.out.println(fruit + " is not available.");
        }

        // Iterate through the map
        System.out.println("Available fruits and their prices:");
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Remove an element
        fruitPrices.remove("Banana");
        System.out.println("After removing Banana: " + fruitPrices);

        // Check if a key or value exists
        System.out.println("Is Cherry available? " + fruitPrices.containsKey("Cherry"));
        System.out.println("Is there any fruit costing 40? " + fruitPrices.containsValue(40));
    }
}

