package Advanced;

import java.util.TreeSet;

public class Pro_twelve {
    public static void main(String[] args) {
        // Create a TreeSet to store integers
        TreeSet<Integer> sortedSet = new TreeSet<>();

        // Add elements to the TreeSet
        sortedSet.add(45);
        sortedSet.add(12);
        sortedSet.add(78);
        sortedSet.add(34);
        sortedSet.add(23);

        // Print the sorted set (automatically sorted in ascending order)
        System.out.println("Sorted set (ascending): " + sortedSet);

        // Adding duplicate elements (TreeSet ignores duplicates)
        sortedSet.add(34);
        sortedSet.add(12);
        System.out.println("After attempting to add duplicates: " + sortedSet);

        // Print the first and last elements
        System.out.println("First element: " + sortedSet.first());
        System.out.println("Last element: " + sortedSet.last());

        // Remove an element from the set
        sortedSet.remove(34);
        System.out.println("After removing 34: " + sortedSet);

        // Print the set in descending order
        System.out.println("Sorted set (descending): " + sortedSet.descendingSet());
    }
}
