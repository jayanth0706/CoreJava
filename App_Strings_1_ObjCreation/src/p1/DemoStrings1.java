package p1;
import java.util.*;
public class DemoStrings1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter a String_1");
			String s1 = s.nextLine();
			System.out.println("====String Litreal Process====");
			System.out.println("The Enter String is "+s1);
			
			System.out.println("Enter a String_2");
			String s2 = s.nextLine();
			System.out.println("====New Operator Process====");
			System.out.println("The Enter String is "+s2);
		}
		catch(Exception e)
		{
			
		}
	}
}
