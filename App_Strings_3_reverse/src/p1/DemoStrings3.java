package p1;
import java.util.*;
public class DemoStrings3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter a String");
			String s1 = s.nextLine();
			int len = s1.length();
			for(int i=len-1;i>=0;i--)
			{
				char ch = s1.charAt(i);
				System.out.print(ch);
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
