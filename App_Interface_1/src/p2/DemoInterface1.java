package p2;
import p1.IClass;
import p1.ITest;
import java.util.*;
@SuppressWarnings("unused")
public class DemoInterface1 
{
	public static void main(String[] args) 
	{
		IClass ob = new IClass();//Implementation Object
		ob.m1(11);
		ob.m2(12);
	}
}
