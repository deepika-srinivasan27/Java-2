package Advanced;

import java.util.ArrayList;
import java.util.List;

public class Pro_nine {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> fruits = new ArrayList<>();

        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Print the list
        System.out.println("Fruits list: " + fruits);

        // Access an element from the list
        System.out.println("First fruit: " + fruits.get(0));

        // Remove an element from the list
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Iterate through the list
        System.out.println("Iterating over the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

