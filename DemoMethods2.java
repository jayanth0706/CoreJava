class Addition
{
	int x; // Non-Static Variable
	int y; // Non-Static Variable
	
	// Instance Method
	void m1()
	{
		System.out.println("The Addition of X and Y is " + (x+y));
	}
}

class Substraction
{
	static int a; // Static Variable
	static int b; // Static Variable
	
	// Static Method
	void m2()
	{
		System.out.println("The Substraction of a and b is " + (a-b));
	}
}

class DemoMethods2 
{
	public static void main(String[] args) 
	{
		System.out.println("=====Main() Class====");
		
		System.out.println("=====Addition() Class====");
		Addition ob1 = new Addition();
		ob1.x = 12;
		System.out.println("x value = " + ob1.x);
		ob1.y = 13;
		System.out.println("y value = " + ob1.y);
		ob1.m1();
		
		System.out.println("=====Substraction() Class====");
		Substraction.a = 15;
		System.out.println("a value = " + Substraction.a);
		Substraction.b = 10;
		System.out.println("b value = " + Substraction.b);
		Substraction ob2 = new Substraction();
		ob2.m2();
	}
}
