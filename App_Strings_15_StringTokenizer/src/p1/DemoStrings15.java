package p1;
import java.util.*;
public class DemoStrings15 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			//Java17-version-by-2021
			System.out.println("Enter a String");
			String str = s.nextLine();
			System.out.println("Enter the Delimiter(Break Specification)");
			String dm = s.nextLine();
			StringTokenizer st = new StringTokenizer(str,dm);
			System.out.println("========================================");
			System.out.println("Number of Tokens : "+st.countTokens());
			while(st.hasMoreTokens())
			{
				String str1 = st.nextToken();
				System.out.print(str1+" ");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
