package p1;
public class CClass extends PClass
{
	public void m1(int x)
	{
		//Method Overriding PClass m1()
		System.out.println("====CClass m1(x)(Overriding)=====");
		System.out.println("The value x:"+x);
	}
	public void m3(int z)
	{
		System.out.println("====CClass m3(z)=====");
		System.out.println("The value z:"+z);
	}
}