package Advanced;

import java.util.Scanner;

public class Pro_four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        // Initialize factorial to 1
        long factorial = 1;

        // Calculate the factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}

