package p1;
import java.util.*;
public class DemoException3
	{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try(s;)//Java9
		{
			System.out.println("Enter the number of Working hours(even):");
			int hrs = s.nextInt();
			System.out.println("Enter the number of persons sharing thehours(even):");
			int pr = s.nextInt();
			int z = hrs/pr;
			System.out.println("No or workings hours:"+hrs);
			System.out.println("No of persons:"+pr);
			System.out.println("Each person work for hrs:"+z);
		}//end of try with resource
		catch(InputMismatchException | ArithmeticException ob)//Java7
		{
			System.out.println("Enter only integer value and greater than zero...");
		}
	}
}