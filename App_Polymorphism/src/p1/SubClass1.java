package p1;
public class SubClass1
{
	private class SubClass2
	{
		public void m2(int x)
		{
			System.out.println("-----m2(x)-----");
			System.out.println("The value x:"+x);
		}
	}//private Instance member InnerClass
	private static class SubClass3
	{
		public void m3(int y)
		{
			System.out.println("-----m3(y)-----");
			System.out.println("The value y:"+y);
		}
	}//private Static member InnerClass
	private SubClass2 ob2 = new SubClass2();
	private SubClass3 ob3 = new SubClass3();

	public void access(int x,int y)
	{
		ob2.m2(x);
		ob3.m3(y);
	}
}//OuterClass