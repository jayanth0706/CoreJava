import java.util.*;
class GreaterNo
{
	int getGreatest(int s1, int s2)
	{
		if(s1<0 && s2<0)
		{
			return (int)-1;
		}
		else if (s1==0 && s2==0)
		{
			return (int)-1;
		}
		else if (s1>s2)
		{
			return s1;
		}
		else
		{
			return s2;
		}
	}
}

class DemoGreaterNumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Interger value:");
		int v1 = s.nextInt();
		System.out.println("Enter Second Interger value:");
		int v2 = s.nextInt();
		GreaterNo ob = new GreaterNo();
		int res = ob.getGreatest(v1,v2);
		System.out.println(res);
		
	}
}
