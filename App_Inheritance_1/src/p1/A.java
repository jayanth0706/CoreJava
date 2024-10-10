package p1;
public class A
{
	public int x;
	public static int y;
	public void m1()
	{
		System.out.println("*****ParentClass Instance m1()*****");
		System.out.println("The value x:"+x);
		System.out.println("The value y:"+y);
	}

	public static void m2()
	{
		System.out.println("*****ParentClass Static m2()*****");
		//System.out.println("The value x:"+x);
		System.out.println("The value y:"+y);
	}
}