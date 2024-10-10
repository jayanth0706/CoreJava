package p1;
public class CClass extends PClass 
{
	public int p;
	public static int q;
	
	public void m3()
	{
		System.out.println("====Instance Method m3() from CClass====");
		System.out.println("The Value of p: "+p);
		System.out.println("The Value of q: "+q);
	}
	public static void m4()
	{
		System.out.println("====Static Method m4() from CClass====");
		System.out.println("The Value of q: "+q);
	}
}
