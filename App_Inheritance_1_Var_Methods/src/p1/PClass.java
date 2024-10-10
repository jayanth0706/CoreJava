package p1;
public class PClass 
{
	public int x;
	public static int y;
	
	public void m1()
	{
		System.out.println("====Instance Method m1() from PClass====");
		System.out.println("The Value of x: "+x);
		System.out.println("The Value of y: "+y);
	}
	public static void m2()
	{
		System.out.println("====Static Method m2() from PClass====");
		System.out.println("The Value of y: "+y);
	}
}
