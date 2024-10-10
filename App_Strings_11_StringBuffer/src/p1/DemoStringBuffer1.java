package p1;
public class DemoStringBuffer1 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		System.out.println("default capacity of sb : "+sb.capacity());
		System.out.println("length of sb : "+sb.length());
		System.out.println("===============================");
		sb.append("Java");
		System.out.println("data in sb : "+sb.toString());
		System.out.println("capacity of sb : "+sb.capacity());
		System.out.println("length of sb : "+sb.length());
		System.out.println("===============================");
		sb.append(" Language Programming");
		System.out.println("data in sb : "+sb.toString());
		System.out.println("capacity of sb : "+sb.capacity());
		System.out.println("length of sb : "+sb.length());
	}
}