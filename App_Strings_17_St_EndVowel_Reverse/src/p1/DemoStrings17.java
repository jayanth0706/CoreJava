package p1;
import java.util.*;
public class DemoStrings17 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			//Apple Banana Car Dog Chimpanzee Score
			System.out.println("Enter the String");
			String s1 = s.nextLine();
			StringTokenizer st = new StringTokenizer(s1," ");
			System.out.println("======Output======");
			int count = st.countTokens();
			System.out.println(count);
			while(st.hasMoreElements())
			{
				String s2 = st.nextToken();
				//System.out.print(s2);
				int len = s2.length();
				char lastChar = s2.charAt(len - 1);

                // Directly check if the last character is a vowel
                if (lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u' ||
                    lastChar == 'A' || lastChar == 'E' || lastChar == 'I' || lastChar == 'O' || lastChar == 'U') 
                {
                    // Reverse the word if the last letter is a vowel
                	StringBuffer sb = new StringBuffer(s2);
                	String rev = sb.reverse().toString();
                	System.out.print(rev+" ");
                } else {
                    System.out.print(s2+" ");
                }
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
