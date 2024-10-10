package p1;
public class DemoWrapperClass1 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		//Boxing process

		Integer ob1 = new Integer(12);
		Integer ob2 = new Integer("23");
		Float ob3 = new Float(12.34F);
		Float ob4 = new Float(345.67);
		Float ob5 = new Float("34.12F");
		Character ob6 = new Character('A');
		Boolean ob7 = new Boolean(true);
		Boolean ob8 = new Boolean("true");
		//UnBoxing process
		int i1 = ob1.intValue();
		int i2 = ob2.intValue();
		float f1 = ob3.floatValue();
		double d = ob4.doubleValue();
		float f2 = ob5.floatValue();

		char ch = ob6.charValue();
		boolean b1 = ob7.booleanValue();
		boolean b2 = ob8.booleanValue();
		System.out.println("-------Date values----");
		System.out.println("int-value:"+i1);
		System.out.println("int-value:"+i2);
		System.out.println("float-value:"+f1);
		System.out.println("double-value:"+d);
		System.out.println("float-value:"+f2);
		System.out.println("char-value:"+ch);
		System.out.println("boolean-value:"+b1);
		System.out.println("boolean-value:"+b2);

	}
}