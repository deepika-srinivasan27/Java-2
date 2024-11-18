package Advanced;
import java.util.ArrayList;
import java.util.List;

public class Pro_ten {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();

        // Add numbers to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Print the entire list
        System.out.println("Numbers list: " + numbers);

        // Calculate the sum of the numbers in the list
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Check if the list contains a specific number
        int searchNumber = 20;
        if (numbers.contains(searchNumber)) {
            System.out.println(searchNumber + " is in the list.");
        } else {
            System.out.println(searchNumber + " is not in the list.");
        }

        // Print the size of the list
        System.out.println("List size: " + numbers.size());
    }
}

