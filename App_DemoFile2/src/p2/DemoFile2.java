package p2;

import java.io.*;

public class DemoFile2 {
    public static void main(String[] args) {
        // Create a BufferedReader to read user input from the console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Try-with-resources to ensure BufferedReader is closed after use
        try (br) {
            // Prompt the user to enter the destination file path and name
            System.out.println("Enter the destination file path and name to record the data:");
            File file = new File(br.readLine());

            // Create a FileWriter to write data to the file
            FileWriter fw = new FileWriter(file);

            // Prompt the user to enter the data (ending with '@')
            System.out.println("Enter the data... (end with '@'):");

            char ch;
            // Read character by character from the input and write to the file
            while ((ch = (char) br.read()) != '@') {
                fw.write(ch);
            }
            
            // Close the FileWriter after data is written
            fw.close();
            System.out.println("Data stored to file successfully...");

            // Now read the stored data from the file and display it
            System.out.println("======Data from file======");

            // Create a FileReader to read the stored data from the file
            FileReader fr = new FileReader(file);
            int k;
            while ((k = fr.read()) != -1) {
                System.out.print((char) k);
            }

            // Close the FileReader
            fr.close();
        } catch (Exception e) {
            // Catch and display any exception that occurs
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
