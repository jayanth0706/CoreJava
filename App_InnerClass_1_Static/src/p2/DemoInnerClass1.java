package p2;
import p1.SubClass1;
import java.util.*;
public class DemoInnerClass1 
{
	public static void main(String[] args) 
	{
		//Object Creation For Scanner
		Scanner s = new Scanner(System.in);
		//Object-Creation For Outer-Class 
		SubClass1 ob1 = new SubClass1();
		//Object-Creation For Inner-Class 
		SubClass1.SubClass2 ob2 = new SubClass1.SubClass2();
		System.out.println("Enter the Value of a");
		SubClass1.a = s.nextInt();
		System.out.println("Enter the Value of b");
		ob1.b = s.nextInt();
		System.out.println("Enter the Value of x");
		SubClass1.SubClass2.x = s.nextInt();
		System.out.println("Enter the Value of y");
		ob2.y = s.nextInt();
		s.close();
		ob1.m1();
		SubClass1.SubClass2.m22();
		ob2.m222();
	}
}
