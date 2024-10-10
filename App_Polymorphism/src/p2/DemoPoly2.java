package p2;
import p1.SubClass1;
public class DemoPoly2 
{
	public static void main(String[] args) 
	{
		SubClass1 ob1 = new SubClass1();//OuterClass Object
		ob1.access(11, 12);//OuterClass method call
	}
}