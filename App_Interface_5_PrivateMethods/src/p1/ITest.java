package p1;
public interface ITest 
{
	public abstract void m1(int a);
	
	private void m2(int b)
	{
		System.out.println("====Non-Static Private Method m2()====");
		System.out.println("The Value of b: "+b);
	}
	
	private static void m3(int c)
	{
		System.out.println("====Static Private Method m2()====");
		System.out.println("The Value of c: "+c);
	}
	
	public default void access(int b, int c)
	{
		this.m2(b);
		ITest.m3(c);
	}
}
