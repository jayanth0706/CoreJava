package p1;
class DemoMain
{
	public static void main(String[] args)
	{
		System.out.println("-----Display from args[]-----");
		for(String k : args)
			{
				System.out.println(k.toString());
			}
	}
}