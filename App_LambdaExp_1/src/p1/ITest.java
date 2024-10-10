package p1;
public interface ITest 
{
	public abstract void m1(int a);
	public default void m2(int b)
	{
		System.out.println("====Default Concrete-Method m1(int a)====");
		System.out.println("The Value b:"+b);
	}
}
