import java.util.*;
class EvOdd
{
	int isEven(int s1)
	{
		if(s1%2==0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
class DemoEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the integer value to Check whether it is Even/odd:");
		int v1 = s.nextInt();
		EvOdd ob = new EvOdd();
		int res = ob.isEven(v1);
		System.out.println("The Entered Value is "+res);
	}
}
