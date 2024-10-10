package p1;

public class PClass {
    // No-argument constructor
    public PClass() {  // Ensure public visibility
        System.out.println("====0-Parameter Constructor From P-Class====");
    }

    // Parameterized constructor
    public PClass(int x) {
        System.out.println("*****PClass parameterized Constructor****");
        System.out.println("The value x: " + x);
    }
}
