package p1;
public class Access 
{
	public static ITest ob = null;
	public static ITest getRef(int choice)
	{
		switch(choice)
		{
		//Case 1 for Addition
		case 1:
			ob = (int a, int b)->
			{
				return (a+b);
			};
			break;
		//Case 2 for Subtraction
		case 2:
			ob = (int a, int b)->
			{
				return (a-b);
			};
			break;
		case 3:
			ob = (int a, int b)->
			{
				return (a*b);
			};
			break;
		case 4:
			ob = (int a, int b)->
			{
				return (int)(a/b);
			};
			break;
		case 5:
			ob = (int a, int b)->
			{
				return (a%b);
			};
			break;
		}
		return ob;
	}
}

