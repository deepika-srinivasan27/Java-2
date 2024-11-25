package Advanced;

import java.util.ArrayList;
import java.util.Collections;

public class Pro_twenty {
    public static void main(String[] args) {
        // Create an ArrayList to store a list of numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(42);
        numbers.add(15);
        numbers.add(89);
        numbers.add(3);

        // Print the unsorted list
        System.out.println("Unsorted List: " + numbers);

        // Sort the list in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted List (Ascending): " + numbers);

        // Sort the list in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted List (Descending): " + numbers);

        // Iterate through the sorted list
        System.out.println("Iterating through the sorted list:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

