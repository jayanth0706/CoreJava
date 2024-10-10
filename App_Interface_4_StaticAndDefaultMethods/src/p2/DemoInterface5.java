package p2;
import p1.*;
public class DemoInterface5 
{
	public static void main(String[] args) 
	{
		IClass ob = new IClass();
		ob.m1(11);
		ITest.m2(12);//Static Method Call
		ob.m3(13);
	}

}
