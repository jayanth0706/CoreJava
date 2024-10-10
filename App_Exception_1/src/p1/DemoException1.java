package p1;
import java.util.*;
@SuppressWarnings("serial")
public class DemoException1 extends Exception
	{
	public DemoException1(String msg)
	{
		super(msg);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try
		{
			System.out.println("Enter the User-Age:");
			int age = s.nextInt();//Exception for Non Integer value
			if(age<=0)//Exception-Condition
			{
				DemoException1 de = new DemoException1("Invalid-age...");//Con_call
				throw de;
			}

			System.out.println("User-Age:"+age);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Enter only Integer value for age...");
		}
		catch(DemoException1 de)
		{
			System.out.println(de.getMessage());
		}
		finally
		{
			s.close();
		}
	}
}