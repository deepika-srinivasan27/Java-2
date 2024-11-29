package Advanced;

import java.util.Scanner;

public class Pro_twentytwo {

    // Bubble Sort function
    public static void bubbleSort(int[] array) {
        int n = array.length;

        // Traverse through all elements in the array
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array size and elements
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Perform Bubble Sort
        bubbleSort(array);

        // Output the sorted array
        System.out.println("Sorted Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}

