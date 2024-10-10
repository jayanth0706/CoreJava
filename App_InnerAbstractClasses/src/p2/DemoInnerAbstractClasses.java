package p2;
import p1.*;

public class DemoInnerAbstractClasses {
    public static void main(String[] args) {
        // Create an instance of the outer class
        CClass ob = new CClass() {
            // Anonymous inner class with empty members
        };

        // Create an instance of the static inner abstract class (AClass1) using an anonymous class
        CClass.AClass1 ob1 = new CClass.AClass1() {
            @Override
            public void m1(int v1) {
                System.out.println("Overriding m1 method in AClass1");
                System.out.println("The Value of v1: " + v1);
            }
        };

        // Call the method m1 with value 11
        ob1.m1(11);

        // Create an instance of the non-static inner abstract class (AClass2) using an anonymous class
        CClass.AClass2 ob2 = ob.new AClass2() {
            @Override
            public void m2(int v2) {
                System.out.println("Overriding m2 method in AClass2");
                System.out.println("The Value of v2: " + v2);
            }
        };

        // Call the method m2 with value 22
        ob2.m2(22);
    }
}
