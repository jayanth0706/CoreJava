package p1;

public class CClass extends PClass {
    // No-argument constructor
    public CClass() {  // Make the constructor public
        System.out.println("====0-Parameter Constructor from C-Class====");
    }

    // Parameterized constructor
    public CClass(int x, int y) {
        super(x);  // Calls parent class constructor with one parameter
        System.out.println("*****CClass parameterized Constructor****");
        System.out.println("The value y: " + y);
    }
}
