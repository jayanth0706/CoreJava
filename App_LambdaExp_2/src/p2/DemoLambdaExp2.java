package p2;
import java.util.*;
import p1.*;
public class DemoLambdaExp2 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value of a");
		int v1 = s.nextInt();
		System.out.println("Enter the Value of b");
		int v2 = s.nextInt();
		System.out.println("====Choice Your Option====");
		System.out.println("====1.Greater===="+"\n====2.Smaller====");
		System.out.print("Enter the Option:");
		int choice = s.nextInt();
		
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
