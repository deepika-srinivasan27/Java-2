package Advanced;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class fileHandling {

    public static void main(String[] args) {
        String fileName = "example.txt";

        // Step 1: Write to the file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a simple file handling example in Java.");
            writer.write("\nThis code demonstrates writing and reading from a file.");
            writer.close();
            System.out.println("Data successfully written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Step 2: Read from the file
        try {
            FileReader reader = new FileReader(fileName);
            int character;
            System.out.println("Reading data from " + fileName + ":");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }

        // Step 3: Check if the file exists and delete it
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("\n\nDeleting " + fileName + " after reading.");
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        }
    }
}

