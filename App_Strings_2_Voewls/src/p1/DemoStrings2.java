package p1;
import java.util.*;
public class DemoStrings2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter a String to find No.of Vowels");
			String s1 = s.nextLine();
			int len = s1.length();
			System.out.println("Vowels");
			for(int i=0;i<=len-1;i++)
			{
				char ch = s1.charAt(i);
				switch(ch)
				{
				case'A':
					System.out.print(ch);
					break;
				case'E':
					System.out.print(ch);
					break;
				case'I':
					System.out.print(ch);
					break;
				case'O':
					System.out.print(ch);
					break;
				case'U':
					System.out.print(ch);
					break;
				case'a':
					System.out.print(ch);
					break;
				case'e':
					System.out.print(ch);
					break;
				case'i':
					System.out.print(ch);
					break;
				case'o':
					System.out.print(ch);
					break;
				case'u':
					System.out.print(ch);
					break;
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
