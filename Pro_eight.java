package Advanced;

import java.util.Scanner;

public class Pro_eight {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int terms = scanner.nextInt();

        // Validate input
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            // Initialize the first two terms
            int first = 0, second = 1;

            System.out.println("Fibonacci series up to " + terms + " terms:");

            for (int i = 1; i <= terms; i++) {
                System.out.print(first + " "); // Print the current term

                // Calculate the next term
                int next = first + second;
                first = second;
                second = next;
            }
        }

        // Close the scanner
        scanner.close();
    }
}

