package p1;
import java.util.*;
public class DemoStrings13 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter a String");
			String s1 = s.nextLine();
			StringBuffer sb = new StringBuffer(s1);
			String s2 = sb.reverse().toString();
			System.out.println(s2);
			if(s1.equals(s2))
			{
				System.out.println("String is Palindrome...");
			}
			else
			{
				System.out.println("String is not Palindrome...");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
