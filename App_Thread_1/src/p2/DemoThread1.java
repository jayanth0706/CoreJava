package p2;
import p1.*;
public class DemoThread1 
{
	public static void main(String[] args) 
	{
		Registration r = new Registration();
		Login l = new Login();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(l);
		t1.start();
		t2.start();
	}
}