package p2;
import p1.*;
public class DemoInnerInterFaces 
{
	public static void main(String[] args) 
	{
		//Inner_InterFaces in a Class
		//Static Inner_InterFace in a Class
		CClass.ITest1 ob1 = (int v1)->
		{
			System.out.println("====Inner-InterFace of m1(11)====");
			System.out.println("The value of v1:"+v1);
		};
		ob1.m1(11);
		//NonStatic Inner_InterFace in a Class
		CClass.ITest2 ob2 = (int v2)->
		{
			System.out.println("====Inner-InterFace of m2(22)====");
			System.out.println("The value of v2:"+v2);
		};
		ob2.m2(22);
		//================================================================//
		//Inner_InterFaces in an InterFace
		//Static Inner_InterFace in an InterFace
		ITest.ITest3 ob3 = (int v3)->
		{
			System.out.println("====Inner-InterFace of m3(33)====");
			System.out.println("The value of v3:"+v3);
		};
		ob3.m3(33);
		//==============================================================//
		//Inner_InterFaces in a Abstract_Class
		//Static Inner_InterFace in a Abstract_Class
		AClass.ITest4 ob4 = (int v4)->
		{
			System.out.println("====Inner-InterFace of m4(44)====");
			System.out.println("The value of v4:"+v4);
		};
		ob4.m4(44);
		//NonStatic Inner_InterFace in a Abstract_Class
		AClass.ITest5 ob5 = (int v5)->
		{
			System.out.println("====Inner-InterFace of m5(55)====");
			System.out.println("The value of v5:"+v5);
		};
		ob5.m5(55);
		//===============================================================//
	}

}
