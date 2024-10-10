package p2;
import java.util.*;
import p1.SubClass1;
@SuppressWarnings("unused")
public class DemoInnerClass3 
{
	public static void main(String[] args)
	{
		SubClass1 ob1 = new SubClass1();
		ob1.m1();//Outer_Class Instance-Method
		SubClass1.m11();//Outer_Class Static-Method
	}
}
