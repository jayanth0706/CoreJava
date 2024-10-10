package p1;
public class DemoStrings9 
{
	public static void main(String[] args) 
	{
		String s1 = "Java";
		String s2 = "Language";
		String s3 = "Programming";

		System.out.println("*****using + Symbol*****");
		String s4 = s1+" "+s2+" "+s3;
		System.out.println("data in s4 : "+s4.toString());
		System.out.println("*****concat()-method*****");
		String s5 = s1.concat(" "+s2);
		String s6 = s1.concat(" "+s2).concat(" "+s3);
		System.out.println("data in s5 : "+s5.toString());
		System.out.println("data in s6 : "+s6.toString());
	}
}