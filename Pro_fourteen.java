package Advanced;

import java.util.Map;
import java.util.TreeMap;

public class Pro_fourteen {
    public static void main(String[] args) {
        // Create a TreeMap (automatically sorts keys)
        Map<String, Integer> studentScores = new TreeMap<>();

        // Add elements to the map
        studentScores.put("John", 85);
        studentScores.put("Alice", 92);
        studentScores.put("Bob", 74);
        studentScores.put("Diana", 88);

        // Display the map (sorted by keys)
        System.out.println("Student Scores (sorted by name):");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Find a specific student's score
        String student = "Alice";
        if (studentScores.containsKey(student)) {
            System.out.println(student + "'s score: " + studentScores.get(student));
        } else {
            System.out.println(student + " is not in the list.");
        }

        // Find the highest and lowest scores using first and last entry
        System.out.println("\nTop student:");
        System.out.println(studentScores.lastEntry().getKey() + ": " + studentScores.lastEntry().getValue());

        System.out.println("\nLowest scoring student:");
        System.out.println(studentScores.firstEntry().getKey() + ": " + studentScores.firstEntry().getValue());

        // Update a student's score
        studentScores.put("Bob", 80);
        System.out.println("\nUpdated Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
