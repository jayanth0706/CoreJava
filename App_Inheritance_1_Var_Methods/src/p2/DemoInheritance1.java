package p2;
import java.util.*;
import p1.*;
public class DemoInheritance1 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//Object Creation for Child Class
		CClass ob = new CClass();
		//Loading Values for Variables 
		System.out.println("Enter the Value of x:");
		ob.x = s.nextInt();
		System.out.println("Enter the Value of y:");
		CClass.y = s.nextInt();
		System.out.println("Enter the Value of p:");
		ob.p = s.nextInt();
		System.out.println("Enter the Value of q:");
		CClass.q = s.nextInt();
		//Methods Calling
		ob.m1();
		CClass.m2();
		
		ob.m3();
		CClass.m4();
	}

}
