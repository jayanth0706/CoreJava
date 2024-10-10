package p2;
import p1.*;
import java.util.*;
public class DemoInheritance4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value-1:");
		int v1 = s.nextInt();
		System.out.println("Enter the value-2:");
		int v2 = s.nextInt();
		CClass ob = new CClass();
		ob.calculate(v1, v2);
		s.close();
	}
}