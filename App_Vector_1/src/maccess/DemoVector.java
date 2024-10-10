package maccess;
import java.util.*;
public class DemoVector 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("default capacity of v : "+v.capacity());
		System.out.println("size of v : "+v.size());

		for(int i=11;i<=20;i++) {
			v.addElement(new Integer(i));
		}
		System.out.println("data in v : "+v.toString());
		System.out.println("capacity of v : "+v.capacity());
		System.out.println("size of v : "+v.size());
		System.out.println("first element : "+v.firstElement());
		System.out.println("last element : "+v.lastElement());
		v.addElement(new Integer(700));
		v.insertElementAt(new Integer(700), 4);
		System.out.println("data in v : "+v.toString());
		System.out.println("capacity of v : "+v.capacity());
		System.out.println("size of v : "+v.size());
		System.out.println("-----Enumeration<E>------");
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
			Integer el = (Integer)e.nextElement();
			System.out.print(el.toString()+" ");
		}
		System.out.println("\n-------Iterator<E>-asIteraor()------");
		Iterator<Integer> it = v.elements().asIterator();
		it.forEachRemaining((k)->
		{
			System.out.print(k.toString()+" ");
		});
	}
}