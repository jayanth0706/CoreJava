package p1;
import java.util.*;
public class DemoArrays4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter the No.Of Strings U wants to enter...");
			int n = s.nextInt();
			s.nextLine(); // Consume the leftover newline character
			System.out.println("Enter the "+n+" Strings.");
			String arr[] = new String[n];
			
			for(int i=0;i<n;i++)
			{
				arr[i] = s.nextLine();
			}
			
			for(String k : arr)
			{
				char ch = k.charAt(0);
				switch(ch)
				{
				case 'A':
				case 'a':
				case 'E':
				case 'e':
				case 'I':
				case 'i':
				case 'O':
				case 'o':
				case 'U':
				case 'u':
					System.out.println(k+" ");
				default:
					continue;
				}
			}
			
		}
		catch(ArrayIndexOutOfBoundsException aioobe)
		{
			System.out.println(aioobe.toString());
		}
	}

}
