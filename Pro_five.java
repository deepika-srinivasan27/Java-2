package Advanced;

import java.util.Scanner;

public class Pro_five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Display the reversed string
        System.out.println("Reversed string: " + reversed);
    }
}

