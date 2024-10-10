package p2;

import java.io.*;
import p1.UserData;
import java.util.*;

public class DemoDeSerialization {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner s = new Scanner(System.in);

        // Use try-with-resources to ensure Scanner is closed automatically
        try (s) {
            // Prompt the user to enter the file path and name where the object is stored
            System.out.println("Enter the file path and name (Source) where the object state is available:");
            File file = new File(s.nextLine());

            // Check if the file exists before proceeding
            if (file.exists()) {
                // Set up input streams to deserialize the object
                try (FileInputStream fis = new FileInputStream(file);
                     ObjectInputStream ois = new ObjectInputStream(fis)) {

                    // Perform deserialization
                    UserData ob2 = (UserData) ois.readObject();
                    
                    // Print the deserialized object details
                    System.out.println("======= User Details =======");
                    System.out.println(ob2);  // Calls the toString() method of UserData
                }
            } else {
                // Handle the case where the specified file does not exist
                System.out.println("Invalid file path or file name.");
            }
        } catch (Exception e) {
            // Handle any exceptions that may occur during deserialization
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
