package Advanced;

import java.util.Arrays;
import java.util.Scanner;

public class Pro_twentyone {
    // Binary Search function
    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoids overflow for large values

            // Check if the target is present at mid
            if (array[mid] == target) {
                return mid;
            }
            // If target is smaller, ignore right half
            else if (array[mid] > target) {
                right = mid - 1;
            }
            // If target is larger, ignore left half
            else {
                left = mid + 1;
            }
        }
        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " elements (sorted):");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the target value
        System.out.println("Enter the target value to search:");
        int target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(array, target);

        // Output the result
        if (result == -1) {
            System.out.println("Target value " + target + " not found in the array.");
        } else {
            System.out.println("Target value " + target + " found at index " + result + ".");
        }

        scanner.close();
    }
}
