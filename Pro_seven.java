package Advanced;
import java.util.Scanner;

public class Pro_seven {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double area = Math.PI * Math.pow(radius, 2);

        // Display the result
        System.out.println("The area of the circle is: " + area);

        // Close the scanner
        scanner.close();
    }
}

