package p2;
import p1.*;

public class DemoInheritance2 {
    public static void main(String[] args) {
        System.out.println("------Object-1---------");
        
        // Creating the first object using the no-argument constructor
        @SuppressWarnings("unused")
		CClass ob1 = new CClass();
        System.out.println("");
        
        // Creating the second object using the parameterized constructor
        @SuppressWarnings("unused")
		CClass ob2 = new CClass(123, 124);
    }
}
