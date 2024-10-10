package p1;
public abstract class AClass 
{
	public static class SubClass2
	{
		public static void m2(int v2)
		{
			System.out.println("====Static Inner-Class in Abstract-Class====");
			System.out.println("The Value of v2:"+v2);
		}
	}
	
	public class SubClass3
	{
		public static void m3(int v3)
		{
			System.out.println("====Instance Inner-Class in Abstract-Class====");
			System.out.println("The Value of v3:"+v3);
		}
	}
}
