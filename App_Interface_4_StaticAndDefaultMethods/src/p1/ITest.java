package p1;
public interface ITest 
{
	public abstract void m1(int a);
	public static void m2(int b)
	{
		System.out.println("====Static Interface Method m2()====");
		System.out.println("The Value of b: "+b);
	}
	public default void m3(int c)
	{
		System.out.println("====Default Interface Method m2()====");
		System.out.println("The Value of c: "+c);
	}
	
}
