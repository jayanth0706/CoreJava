package p2;
import p1.Display;
public class DemoGeneric
{
	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		Display<Integer> ob1 = new Display<Integer>();
		Display<Float> ob2 = new Display<Float>();
		Display<String> ob3 = new Display<String>();
		ob1.setOb(new Integer(12));
		ob2.setOb(new Float(12.34F));
		ob3.setOb(new String("NIT"));
		System.out.println("Integer : "+ob1.getOb());
		System.out.println("Float : "+ob2.getOb());
		System.out.println("String : "+ob3.getOb());
	}
}