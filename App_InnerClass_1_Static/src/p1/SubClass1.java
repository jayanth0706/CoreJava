package p1;
public class SubClass1 
{
	//Outer-Class Variables
	public static int a;
	public int b;
	
	//Outer-Class Instance-Method
	public void m1()
	{
		System.out.println("====Outer-Class Instance Method m1()====");
		System.out.println("The Value of a: "+a);
		System.out.println("The Value of b: "+b);
	}
	
	//Creating Inner_Class by the name "SubClass2"
	public static class SubClass2
	{
		//Inner-Class Variables
		public static int x;
		public int y;
		
		//Inner-Class Static Method
		public static void m22()
		{
			System.out.println("====Static Inner Class Static Method m22()====");
			System.out.println("The Value of a: "+a);
			System.out.println("The Value of x: "+x);
		}
		//Inner-Class Instance Method
		public void m222()
		{
			System.out.println("====Static Inner Class Instance Method m222()====");
			System.out.println("Outer-Class Static Variable a: "+a);
			System.out.println("The Value of x: "+x);
			System.out.println("The Value of y: "+y);

		}
	}
}
