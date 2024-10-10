package p1;
import java.util.*;
public class DemoArrays2 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter the number of Integer elements:");
			int n = s.nextInt();
			System.out.println("Enter the"+ n +"Integer elements:");
			Integer arr[] = new Integer[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = new Integer(s.nextInt());
			}
			for(Integer k: arr)
			{
				if(k%3==0)
				{
					continue;
				}
				else
				{
					System.out.print(k.toString()+" ");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
