package p1;
public class B extends A
{
	public int p;
	public static int q;
	public void m3()
	{
		System.out.println("*****ChildtClass Instance m3()*****");
		System.out.println("The value p:"+p);
		System.out.println("The value q:"+q);
	}
	public static void m4()
	{
		System.out.println("*****ChildClass Static m4()*****");
		//System.out.println("The value p:"+p);
		System.out.println("The value q:"+q);
	}
}