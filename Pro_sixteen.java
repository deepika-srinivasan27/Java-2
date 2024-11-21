package Advanced;

import java.util.SortedMap;
import java.util.TreeMap;

public class Pro_sixteen {
    public static void main(String[] args) {
        // Create a SortedMap to store student grades
        SortedMap<Integer, String> studentGrades = new TreeMap<>();

        // Add student grades to the SortedMap
        studentGrades.put(102, "B");
        studentGrades.put(101, "A");
        studentGrades.put(105, "C");
        studentGrades.put(103, "A+");
        studentGrades.put(104, "B+");

        // Display all student grades in sorted order by ID
        System.out.println("Student Grades (Sorted by ID):");
        for (var entry : studentGrades.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Grade: " + entry.getValue());
        }

        // Retrieve the grade of a specific student (e.g., ID 103)
        int studentId = 103;
        if (studentGrades.containsKey(studentId)) {
            System.out.println("\nGrade of student with ID " + studentId + ": " + studentGrades.get(studentId));
        } else {
            System.out.println("\nStudent with ID " + studentId + " not found.");
        }

        // Get students with IDs less than 104
        SortedMap<Integer, String> studentsBefore104 = studentGrades.headMap(104);
        System.out.println("\nStudents with IDs less than 104:");
        for (var entry : studentsBefore104.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Grade: " + entry.getValue());
        }

        // Get students with IDs from 103 onward
        SortedMap<Integer, String> studentsFrom103 = studentGrades.tailMap(103);
        System.out.println("\nStudents with IDs from 103 onward:");
        for (var entry : studentsFrom103.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
    }
}
