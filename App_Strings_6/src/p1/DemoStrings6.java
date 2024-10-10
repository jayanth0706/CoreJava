package p1;
import java.util.*;
public class DemoStrings6 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			String str = "java version 17 by 2021";
			int len = str.length();
//=============================================================================//
			System.out.println("====Consonents====");
			for(int i=0;i<=len-1;i++)
			{
				char ch = str.charAt(i);
				int ac = (int) ch;
				if((ac>=65 && ac<=90)||(ac>=97 && ac<=122))
				{
					switch(ch)
					{
					case 'A'://A
						break;
					case 'E'://E  
						break;
					case 'I'://I
						break;
					case 'O'://O
						break;
					case 'U'://U
						break;
					case 'a'://a
						break;
					case 'e'://e
						break;
					case 'i'://i
						break;
					case 'o'://o
						break;
					case 'u'://u
						break;
					default:
						System.out.print(ch);
					}
				}
				
			}
//=============================================================================//
			System.out.println("\n====Consonents-Count====");
			for(int i=0;i<=len-1;i++)
			{
				char ch = str.charAt(i);
				int ac = (int) ch;
				int count = 0;
				if((ac>=65 && ac<=90)||(ac>=97 && ac<=122))
				{
					switch(ch)
					{
					case 'A'://A
						break;
					case 'E'://E  
						break;
					case 'I'://I
						break;
					case 'O'://O
						break;
					case 'U'://U
						break;
					case 'a'://a
						break;
					case 'e'://e
						break;
					case 'i'://i
						break;
					case 'o'://o
						break;
					case 'u'://u
						break;
					default:
						count++;
					}
				}
				
			}
//=============================================================================//
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
