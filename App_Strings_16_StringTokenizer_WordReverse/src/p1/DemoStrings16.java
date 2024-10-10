package p1;
import java.util.*;
public class DemoStrings16 
{
	public static void main(String[] args) 
	{
		//Java17-Version-by-2021
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter the String");
			String s1 = s.nextLine();
			System.out.println("Enter the Delimiter");
			String s2 = s.nextLine();
			System.out.println("======Output======");
			StringTokenizer st = new StringTokenizer(s1,s2);
			System.out.println(st.countTokens());
			while(st.hasMoreElements())
			{
				String s3 = st.nextToken();
				//System.out.print(s3);
				//for Reversing the Words using StringBuffer(String)
				StringBuffer sb = new StringBuffer(s3);
				String rev = sb.reverse().toString();
				System.out.print(rev+" ");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
