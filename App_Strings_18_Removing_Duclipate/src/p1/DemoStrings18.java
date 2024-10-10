package p1;
import java.util.*;
public class DemoStrings18 
{
	public static void main(String[] args) 
	{
		//Programming
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter a String");
			String s1 = s.nextLine();
			int len = s1.length();
			for(int i=0;i<=len-1;i++)
			{
				char ch = s1.charAt(i);
				
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
