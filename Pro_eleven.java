package Advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pro_eleven {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(34);
        numbers.add(23);

        // Print the list before sorting
        System.out.println("Before sorting: " + numbers);

        // Sort the list in ascending order
        Collections.sort(numbers);
        System.out.println("After sorting in ascending order: " + numbers);

        // Sort the list in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("After sorting in descending order: " + numbers);

        // Add a new element while maintaining sorted order (ascending)
        int newElement = 50;
        numbers.add(newElement);
        Collections.sort(numbers);
        System.out.println("After adding " + newElement + " and re-sorting: " + numbers);

        // Check if the list contains a specific element
        int searchElement = 23;
        if (numbers.contains(searchElement)) {
            System.out.println("The list contains " + searchElement);
        } else {
            System.out.println(searchElement + " is not in the list");
        }
    }
}
