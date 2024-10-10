package p1;
import java.util.*;
public class DemoArrays3 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			//we cannot use int count = 0;here
			System.out.println("Enter the no of Integers.....");
			int n = s.nextInt();
			System.out.println("Enter"+ n +"Integers.....");
			Integer arr[] = new Integer[n];
			
			for(int i=0;i<n;i++)
			{
				arr[i] = new Integer(s.nextInt());
			}
			
			for(Integer k : arr)
			{
				int count = 0;
				//Checking No.of Divisors
				for(int i=1;i<=k;i++)//Start i=1 to avoid division with zero
				{
					if(k % i == 0)
					{
						count++;
					}
				}
				//If count==2 then Prime
				//If count>2 then Non-Prime
				if(count==2)
				{
					continue;
				}
				else
				{
					System.out.println(k+" ");
				}
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.toString());
		}
	}
}
