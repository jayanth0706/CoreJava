package p1;
public class DemoStrings10 
{
	public static void main(String[] args) 
	{
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Hyd");
		String s4 = new String("Hyd");
		System.out.println("=====String Literal process======");
		if(s1==s2) {
			System.out.println("Strings are equal...");
		}else {
			System.out.println("Strings are NotEqual...");
		}
		System.out.println("=====new Operator process====");
		if(s3==s4) {
			System.out.println("Strings are equal...");
		}else {
			System.out.println("Strings are NotEqual...");
		}
	}
}