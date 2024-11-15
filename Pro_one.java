package Advanced;

import java.io.*;

public class Pro_one {

    public static void main(String[] args) {
        String filePath = "example.txt";

        // Writing to the file
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hello, this is a file handling example in Java.\n");
            writer.write("File handling is an essential concept for managing data.");
            System.out.println("Data successfully written to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Reading from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("\nReading from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

