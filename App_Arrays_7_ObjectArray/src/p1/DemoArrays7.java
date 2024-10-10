package p1;
public class DemoArrays7
{
	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		Object o[] = new Object[5];
		o[0] = new Integer(12);
		o[1] = new Float(12.34F);
		o[2] = new Character('A');
		o[3] = new Boolean(true);
		o[4] = new String("NIT");
		System.out.println("======Display from Object Array====");
		for(Object k : o)
		{
			System.out.println("Element : "+k.toString());
		}
	}
}