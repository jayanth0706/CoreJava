package p1;
import java.util.*;
public class DemoStrings4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter a String");
			String s1 = s.nextLine();
			int len = s1.length();
			for(int i=0;i<=len-1;i++)
			{
				char ch = s1.charAt(i);
				if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U' &&
				   ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' &&
				   ch!='1' && ch!='2' && ch!='3' && ch!='4' && ch!='5' &&
				   ch!='6' && ch!='7' && ch!='8' && ch!='9' && ch!='0'
				   )
				{
					System.out.print(ch);
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
