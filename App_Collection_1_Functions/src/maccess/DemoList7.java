package maccess;
import java.util.*;
public class DemoList7 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al1.add(new Integer(11));
		al1.add(new Integer(12));
		al1.add(new Integer(13));
		al1.add(new Integer(14));

		al2.add(new Integer(21));
		al2.add(new Integer(22));
		al2.add(new Integer(23));
		al2.add(new Integer(24));
		
		al3.add(new Integer(11));
		al3.add(new Integer(22));
		al3.add(new Integer(13));
		al3.add(new Integer(34));

		System.out.println("List al1 : "+al1.toString());
		System.out.println("List al2 : "+al2.toString());
		System.out.println("List al3 : "+al3.toString());
		
		System.out.println("======contains(Object)======");
		System.out.println("12 available in al1 : "+al1.contains(new Integer(12)));
		System.out.println("containsAll(Collection<E>)=====");
		System.out.println("al1 contains al2 : "+al1.containsAll(al2));
		System.out.println("======addAll(Collection<E>)======");
		al1.addAll(al2);

		System.out.println("List al1 : "+al1.toString());
		System.out.println("List al2 : "+al2.toString());
		System.out.println("List al3 : "+al3.toString());
		System.out.println("======addAll(index,Collection&lt;E&gt;)======");
		al1.addAll(4, al3);

		System.out.println("List al1 : "+al1.toString());
		System.out.println("List al2 : "+al2.toString());
		System.out.println("List al3 : "+al3.toString());
		System.out.println("====removeAll(Collection<E>)======");
		al1.removeAll(al2);

		System.out.println("List al1 : "+al1.toString());
		System.out.println("List al2 : "+al2.toString());
		System.out.println("List al3 : "+al3.toString());
		System.out.println("=====retainAll(Collection<E>)=====");
		al1.retainAll(al3);
		
		System.out.println("List al1 : "+al1.toString());
		System.out.println("List al2 : "+al2.toString());
		System.out.println("List al3 : "+al3.toString());
		System.out.println("=====clear()=====");
		al3.clear();

		System.out.println("List al1 : "+al1.toString());
		System.out.println("List al1 : "+al2.toString());
		System.out.println("List al1 : "+al3.toString());
		System.out.println("=====indexOf(Object)======");
		System.out.println("index of 11 : "+al1.indexOf(new Integer(11)));
		System.out.println("=====lastIndexOf(Object)======");
		System.out.println("last index of 13 : "+al1.lastIndexOf(new Integer(13)));
		
		System.out.println("=====sublist(startIndex,endIndex)=====");
		List<Integer> sl = al1.subList(1, 3);
		System.out.println("sub list : "+sl.toString());
	}
}