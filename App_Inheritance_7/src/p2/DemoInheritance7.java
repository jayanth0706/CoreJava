package p2;
import java.util.*;
import p1.Display;
@SuppressWarnings("unused")
public class DemoInheritance7 
{
	public static void main(String[] args) 
	{
		Display ob = new Display(11,12);//Constructors Values
		ob.dis(22, 23);//Instance Method Values
		Display.m(33, 34);//Static Method Values
	}
}
