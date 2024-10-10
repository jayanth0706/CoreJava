package p2;
import java.util.*;
import p1.SubClass1;
public class DemoInnerClass2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		//Object_Creation for Outer_Class "SubClass1"
		SubClass1 ob1 = new SubClass1();
		//Object_Creation for Inner_Class "SubClass2"
		SubClass1.SubClass2 ob2 = ob1.new SubClass2();
		
		System.out.println("Enter The Value of a");
		SubClass1.a = s.nextInt();
		System.out.println("Enter The Value of b");
		ob1.b = s.nextInt();
		System.out.println("Enter The Value of x");
		SubClass1.SubClass2.x = s.nextInt();
		System.out.println("Enter The Value of y");
		ob2.y = s.nextInt();
		s.close();
		
		//Methods Calling 
		ob1.m1();
		SubClass1.SubClass2.m2();
		ob2.m22();
	}
}
