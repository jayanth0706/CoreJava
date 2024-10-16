package p2;

import p1.UserData;
import java.util.*;
import java.io.*;

public class DemoSerialization {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner s = new Scanner(System.in);

        // Use try-with-resources to ensure Scanner is closed automatically
        try (s) {
            // Collect user data
            System.out.println("Enter the UserName:");
            String uName = s.nextLine();
            
            System.out.println("Enter the MailId:");
            String mId = s.nextLine();
            
            System.out.println("Enter the City:");
            String city = s.nextLine();

            // Create a new UserData object with the input data and the current date
            UserData ob1 = new UserData(uName, mId, city, new Date());

            // Get the file path and name to store the serialized object
            System.out.println("Enter the destination file path and name to store the object:");
            File file = new File(s.nextLine());

            // Serialize the UserData object and store it in the specified file
            try (FileOutputStream fos = new FileOutputStream(file);
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                // Perform serialization
                oos.writeObject(ob1);
                System.out.println("Object state stored to file successfully...");
            }
        } catch (Exception e) {
            // Handle any exceptions that occur during the process
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
