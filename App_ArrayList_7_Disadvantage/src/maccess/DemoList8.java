package maccess;
import java.util.*;
public class DemoList8
{
	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		ArrayList<Integer> al1 = new ArrayList<Integer>();//Mutable Object
		al1.add(new Integer(11));
		al1.add(new Integer(12));
		al1.add(new Integer(13));
		al1.add(new Integer(14));
		List<Integer> al2 = List.of(121,123,101,104,100);//Immutable Object
		System.out.println("data in list-1 : "+al1.toString());
		System.out.println("data in list-2 : "+al2.toString());
		List<Integer> al3 = List.copyOf(al1);//Immutable Object
		System.out.println("data in list-3 : "+al3.toString());
		System.out.println("-----toArray()------");
		Object o[] = al1.toArray();
		for(Object k : o)
		{
			System.out.print(k.toString()+" ");
		}
		System.out.println("\n-----toArray(T[])------");
		Integer arr[] = new Integer[al1.size()];
		al1.toArray(arr);
		for(Integer k : arr)
		{
			System.out.print(k.toString()+" ");
		}
	}
}