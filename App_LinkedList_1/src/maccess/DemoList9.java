package maccess;

import java.util.*;
public class DemoList9 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(new Integer(21));
		ll.add(new Integer(22));
		ll.add(new Integer(23));
		ll.add(new Integer(21));
		System.out.println("data in LinkedList : "+ll.toString());
	}
}