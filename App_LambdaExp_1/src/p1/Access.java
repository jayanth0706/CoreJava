package p1;
public class Access 
{
	public static ITest getRef()
	{
		ITest ob = (int a)->
		{
			System.out.println("====Implemented Method m2(int b)====");
			System.out.println("The Value of b:"+a);
		};
		return ob;
	}//OuterClass Static Method
}//OuterClass
