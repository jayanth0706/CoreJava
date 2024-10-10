package p2;
import p1.*;

public class DemoLambdaExp1 
{
	public static void main(String[] args) 
	{
		ITest ob = Access.getRef();
		ob.m1(11);
		ob.m2(12);
	}
}
