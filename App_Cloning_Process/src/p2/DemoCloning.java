package p2;

import java.util.Scanner;
import p1.Employee;

public class DemoCloning {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner s = new Scanner(System.in);
        try (s) {
            // Get Employee details from the user
            System.out.println("Enter the Emp-Id:");
            String eId = s.nextLine();
            System.out.println("Enter the Emp-Name:");
            String eName = s.nextLine();
            System.out.println("Enter the Emp-Desg:");
            String eDesg = s.nextLine();

            // Display the original Employee object
            System.out.println("******Original Object******");
            Employee e1 = new Employee(eId, eName, eDesg);
            System.out.println(e1.toString());
            System.out.println("hashCode of e1: " + e1.hashCode());

            // Clone the Employee object and display the cloned object
            System.out.println("*****Duplicate Object (Cloned Object)*****");
            Employee e2 = (Employee) e1.getClone();
            System.out.println(e2.toString());
            System.out.println("hashCode of e2: " + e2.hashCode());

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.toString());
        }
    }
}
