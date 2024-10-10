package p1;

public class CClass {
    // Static Inner-AbstractClass in a Class
    public static abstract class AClass1 {
        public abstract void m1(int v1);  // Abstract method
    }

    // NonStatic Inner-AbstractClass in a Class
    public abstract class AClass2 {
        public void m2(int v2) {
            System.out.println("NonStatic Inner-AbstractClass in a Class");
            System.out.println("The Value of v2: " + v2);
        }
    }
}
