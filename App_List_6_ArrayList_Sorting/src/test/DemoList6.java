package test;
import java.util.*;
import maccess.Sorting;
public class DemoList6 
{
	@SuppressWarnings({ "removal", "unchecked" })
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			ArrayList<Integer> al = new ArrayList<Integer>();
			System.out.println("Enter the number of elements:");
			int n = s.nextInt();
			System.out.println("-----Enter "+n+" elements-----");
			for(int i=1;i<=n;i++) 
			{
				al.add(new Integer(s.nextInt()));
			}//end of loop
			System.out.println("List : "+al.toString());
			System.out.println("======Sorted Elements=====");
			al.sort(new Sorting());
			System.out.println("List : "+al.toString());
		}
		catch(Exception e) 
		{
			System.out.println(e.toString());
		}
	}
}