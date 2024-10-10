package p1;
public interface ITest 
{
	public static class SubClass1
	{
		public static void m1(int v1)
		{
			System.out.println("====Static Inner-Class in Interface====");
			System.out.println("The Value of v1:"+v1);
		}
	}
}
