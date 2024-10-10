package maccess;
import java.util.*;
public class DemoDeque 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		for(int i=11;i<=20;i++) {
			ad.add(new Integer(i));
		}
		System.out.println("Elements in ad : "+ad.toString());
		ad.addFirst(new Integer(500));
		ad.addLast(new Integer(700));
		System.out.println("Elements in ad : "+ad.toString());
		ad.removeFirst();
		ad.removeLast();
		System.out.println("Elements in ad : "+ad.toString());
	}
}