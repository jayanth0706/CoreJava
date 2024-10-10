package p1;

public abstract class AClass {
    // Static Inner-AbstractClass in an Abstract Class
    public static abstract class AClass4 {
        public void m4(int v4) {
            System.out.println("Static Inner-AbstractClass in a Class");
            System.out.println("The Value of v4: " + v4);
        }
    }

    // Static Inner-AbstractClass in a Class
    public static abstract class AClass5 {
        public void m5(int v5) {
            System.out.println("NonStatic Inner-AbstractClass in a Class");
            System.out.println("The Value of v5: " + v5);
        }
    }
}
