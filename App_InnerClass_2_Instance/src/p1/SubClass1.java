package p1;
public class SubClass1 
{
	//Outer-Class Variables
	public static int a;
	public int b;
	//Outer-Class Instance_Method
	public void m1()
	{
		System.out.println("====Outer-Class Instance Method m1()====");
		System.out.println("The Value of a:"+a);
		System.out.println("The Value of b:"+b);
	}
	
	//Creating Inner_Class by the name "SubClass2"
	public class SubClass2
	{
		//Inner_Class Variables
		public static int x;
		public int y;
		//Inner_Class Static_Method
		public static void m2()
		{
			System.out.println("====Inner-Class Static Method m1()====");
			System.out.println("The Value of a:"+a);
			System.out.println("The Value of x:"+x);//but not value of y and b
		}
		//Inner_Class Instance_Method
		public void m22()
		{
			System.out.println("====Inner-Class Instance Method m1()====");
			System.out.println("The Value of a:"+a);
			System.out.println("The Value of b:"+b);
			System.out.println("The Value of x:"+x);
			System.out.println("The Value of y:"+y);
		}
	}
}
