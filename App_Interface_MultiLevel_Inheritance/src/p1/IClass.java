package p1;
public class IClass implements ITest2
{
	public void m1(int x)
	{
		System.out.println("====m1(x)====");
		System.out.println("Value of P: "+p);
		System.out.println("Value of Q: "+q);
		System.out.println("Value of X: "+x);
	}
	
	public void m2(int y)
	{
		System.out.println("====m1(2)====");
		System.out.println("Value of P: "+p);
		System.out.println("Value of Q: "+q);
		System.out.println("Value of Y: "+y);
	}
}
