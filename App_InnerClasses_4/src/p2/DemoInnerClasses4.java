package p2;
import p1.*;
public class DemoInnerClasses4 
{
	public static void main(String[] args) 
	{
		//ITest.SubClass1 ob1 = new ITest.SubClass1();
		//ob1.m1(11);
		@SuppressWarnings("unused")
		AClass ob = new AClass()
		{
		//Anonymous InnerClass_body_with_empty members
		};
		ITest.SubClass1.m1(11);
		
		//AClass.SubClass2 ob2 = new AClass.SubClass2();
		//ob2.m2(22);
		@SuppressWarnings("unused")
		AClass ob2 = new AClass()
		{
		//Anonymous InnerClass_body_with_empty members
		};
		AClass.SubClass2.m2(22);
		
		
		@SuppressWarnings("unused")
		AClass ob3 = new AClass()
		{
		//Anonymous InnerClass_body_with_empty members
		};
		AClass.SubClass3.m3(33);
	}
}
