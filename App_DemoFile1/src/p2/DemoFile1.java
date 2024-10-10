package p2;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DemoFile1 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner s = new Scanner(System.in);

        // Use try-with-resources to automatically close the scanner
        try (s) {
            // Get source file path from the user
            System.out.println("Enter the source file path and name:");
            File sourceFile = new File(s.nextLine());

            // Check if the source file exists
            if (sourceFile.exists()) {
                // Initialize FileInputStream to read from the source file
                FileInputStream fis = new FileInputStream(sourceFile);

                // Get destination file path from the user
                System.out.println("Enter the destination file path and name:");
                File destinationFile = new File(s.nextLine());

                // Initialize FileOutputStream to write to the destination file
                FileOutputStream fos = new FileOutputStream(destinationFile);

                // Read from source and write to destination
                int byteData;
                while ((byteData = fis.read()) != -1) {
                    fos.write(byteData);
                }

                // Close the streams after copying is complete
                fos.close();
                fis.close();

                // Success message
                System.out.println("File copied successfully...");
            } else {
                // If the source file does not exist, print an error message
                System.out.println("Invalid source file path or name.");
            }
        } catch (Exception e) {
            // Print any exceptions that occur
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
