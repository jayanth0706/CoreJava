package p1;
public class Access 
{
	public static ITest ob = null;
	public static ITest getRef(int choice)
	{
		switch(choice)
		{
		//Case 1 for Greater
		case 1:
			ob = (int a, int b)->
			{
				if (a>b) return a;
				else return b;
			};
			break;
		//Case 2 for Smaller
		case 2:
			ob = (int a, int b)->
			{
				if (a<b) return a;
				else return b;
			};
			break;
		}
		return ob;
	}
}
