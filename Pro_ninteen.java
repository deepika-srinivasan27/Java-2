package Advanced;

import java.util.TreeSet;

public class Pro_ninteen {
    public static void main(String[] args) {
        // Create a TreeSet to store a sorted list of numbers
        TreeSet<Integer> sortedNumbers = new TreeSet<>();

        // Add elements to the sorted list
        sortedNumbers.add(5);
        sortedNumbers.add(1);
        sortedNumbers.add(8);
        sortedNumbers.add(3);

        // Print the sorted list
        System.out.println("Sorted List: " + sortedNumbers);

        // Add a duplicate element (won't be added since TreeSet doesn't allow duplicates)
        sortedNumbers.add(3);
        System.out.println("After adding duplicate 3: " + sortedNumbers);

        // Remove an element
        sortedNumbers.remove(1);
        System.out.println("After removing 1: " + sortedNumbers);

        // Check if an element exists
        System.out.println("Does 5 exist? " + sortedNumbers.contains(5));

        // Iterate over the sorted list
        System.out.println("Iterating through the sorted list:");
        for (Integer number : sortedNumbers) {
            System.out.println(number);
        }
    }
}

