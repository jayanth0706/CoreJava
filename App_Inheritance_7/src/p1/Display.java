package p1;
public class Display 
{
	//Constructor
	public Display(int x,int y)
	{
		this(x);
		System.out.println("====Constructor Display(x,y)====");
		System.out.println("The value of X: "+x);
		System.out.println("The value of Y: "+y);
	}
	//We this Display Constructor to above Display Constructor using this(x) in above Display Constructor
	public Display(int x)
	{
		System.out.println("====Constructor Display(x)====");
		System.out.println("The value of X: "+x);
	}
	
//============================================================================//
	
	//Instance Methods
	public void dis(int a,int b)
	{
		this.dis(a);
		System.out.println("====Constructor Display(a,b)====");
		System.out.println("The value of A: "+a);
		System.out.println("The value of B: "+b);
	}
	public void dis(int a)
	{
		System.out.println("====Constructor Display(a)====");
		System.out.println("The value of A: "+a);
	}
	
//============================================================================//
	
	//Static Methods
	public static void m(int p,int q)
	{
		//we cannot access methods  directly using this pre-defined Key-word.
		System.out.println("====Constructor Display(p,q)====");
		System.out.println("The value of P: "+p);
		System.out.println("The value of Q: "+q);
	}
	public static void m(int p)
	{
		System.out.println("====Constructor Display(p)====");
		System.out.println("The value of P: "+p);
	}
	public void acess(int p, int q)
	{
		this.m(p);
		this.acess(p, q);
	}
	
//============================================================================//
	
}
