package p1;
public class SubClass1 
{
	//Instance Method Inner_Class inside method m1()
	public void m1()
	{
		class SubClass2
		{
			public void m2(int x)
			{
				System.out.println("----InnerClass in Instance_Method m2()----");
				System.out.println("The Value of x: "+x);
			}
		}//Local Member Inner_Class[Instance_Member InnerClass]
		SubClass2 ob2 = new SubClass2();
		ob2.m2(12);
	}//OuterClass Instance Method
	
	
	//Static Inner_Class inside method m11()
	public static void m11()
	{
		class SubClass3
		{
			public void m3(int y)
			{
				System.out.println("----InnerClass in Static_Method m3()----");
				System.out.println("The Value of y: "+y);
			}
		}//Local Member Inner_Class[Static_Member InnerClass]
		SubClass3 ob3 = new SubClass3();
		ob3.m3(13);
	}//OuterClass Instance Method

}//OuterClass
