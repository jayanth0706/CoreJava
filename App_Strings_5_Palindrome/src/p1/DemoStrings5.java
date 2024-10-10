package p1;
import java.util.*;
public class DemoStrings5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter a String");
			String s1 = s.nextLine();
			int len = s1.length();
			
			// Initialize StringBuilder to build the reversed string
            StringBuilder rs = new StringBuilder();
            
			for(int i=len-1;i>=0;i--)
			{
				char ch = s1.charAt(i);
				rs.append(ch);
			}
			
			// Convert StringBuilder to String and assign to x
            String x = rs.toString();
            // Print the reversed string
            System.out.println("Reversed String: " + x);
            
            // Checking for Palindrome using .equals() to compare string content
            if(s1.equals(x))
            {
                System.out.println("String is Palindrome");
            }
            else
            {
                System.out.println("String is not Palindrome");
            }
		}
		catch(Exception e)
		{
			
		}
	}
}
