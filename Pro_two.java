package Advanced;

import java.io.*;

public class Pro_two {

    public static void main(String[] args) {
        String filePath = "example_append.txt";

        // Appending data to the file
        try (FileWriter writer = new FileWriter(filePath, true)) {  // 'true' enables append mode
            writer.write("This line is appended to the file.\n");
            writer.write("File handling is flexible in Java.\n");
            System.out.println("Data successfully appended to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while appending to the file: " + e.getMessage());
        }

        // Reading from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("\nReading the file contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

