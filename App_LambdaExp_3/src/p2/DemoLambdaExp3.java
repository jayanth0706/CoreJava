package p2;
import java.util.*;
import p1.*;
public class DemoLambdaExp3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value of a");
		int v1 = s.nextInt();
		System.out.println("Enter the Value of b");
		int v2 = s.nextInt();
		System.out.println("====Choice Your Option====");
		System.out.println("====1.Addition===="+"\n====2.Subtraction===="+"\n====3.Multiplication===="+"\n====4.Division===="+"\n====5.Modulo-Division====");
		System.out.print("Enter the Option:");
		int choice = s.nextInt();
		s.close();
		
		//Object-Creation
		ITest ob = Access.getRef(choice);
		if(ob==null)
		{
			System.out.println("====Invalid Option====");
		}
		else
		{
			System.out.print("Result :"+ob.compareTo(v1, v2));
		}
	}
}
