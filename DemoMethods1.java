class Acess
{
	static int a;
	int b;
	
	// Static Method
	static void m1()
	{
		System.out.println("Extracting Value of a i.e " + a);
	}
	
	// Instance Method
	void m2()
	{
		System.out.println("Extracting Value of a i.e " + a);
		System.out.println("Extracting Value of b i.e " + b);
	}
}

class DemoMethods1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println("====Main()====");
		Acess.a = 25;
		System.out.println("Value of a = " +Acess.a);
		
		// Object Creation
		Acess ob1 = new Acess();
		ob1.b = 90;
		System.out.println("Value of b = " +ob1.b);
		
		// Static Method
		Acess.m1();
		
		// Instance Method
		ob1.m2();
	}
}
