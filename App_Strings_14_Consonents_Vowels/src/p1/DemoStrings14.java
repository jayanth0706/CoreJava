package p1;
import java.util.*;
public class DemoStrings14 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter a String");
			String str1 = s.nextLine();
			int len = str1.length();
			for(int i=0; i<=len-1; i++)
			{
				char ch = str1.charAt(i);
				//System.out.print(ch);
				int ac = (int)ch;
				if((ac>=65 && ac<=90) || (ac>=97 && ac<=122))
				{
					System.out.print(ch);
				}
							
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
