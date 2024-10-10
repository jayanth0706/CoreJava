package p2;
import p1.*;
public class DemoInheritance5
{
	public static void main(String[] args)
	{
		System.out.println("------Generalization process-----");
		PClass ob = new CClass();
		ob.m1(11);
		ob.m2(12);
		//ob.m3(13);//Error
		//System.out.println("-----Specialization process----");
		//CClass ob2 = (CClass)new PClass();
	}
}