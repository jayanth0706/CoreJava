package p1;

public class Employee extends Object implements Cloneable {
    // Fields for Employee details
    public String eId, eName, eDesg;

    // Constructor to initialize Employee object
    public Employee(String eId, String eName, String eDesg) {
        this.eId = eId;
        this.eName = eName;
        this.eDesg = eDesg;
    }

    // Overriding toString() method to display employee details
    @Override
    public String toString() {
        return "Emp-Id: " + eId + "\nEmp-Name: " + eName + "\nEmp-Desg: " + eDesg;
    }

    // Method to clone the Employee object
    public Object getClone() throws CloneNotSupportedException {
        return super.clone(); // Call the Object class's clone() method
    }
}
