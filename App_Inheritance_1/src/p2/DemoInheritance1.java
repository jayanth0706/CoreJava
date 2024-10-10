package p2;
import java.util.*;
import p1.*;
public class DemoInheritance1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		B ob = new B();//ChildClass Object
		//Inputs
		System.out.println("Enter the value for x:");
		ob.x = s.nextInt();
		System.out.println("Enter the value for y:");
		B.y = s.nextInt();
		System.out.println("Enter the value for p:");
		ob.p = s.nextInt();
		System.out.println("Enter the value for q:");
		B.q = s.nextInt();
		//Method Calling
		ob.m1();
		B.m2();
		ob.m3();
		B.m4();
		s.close();
	}
}