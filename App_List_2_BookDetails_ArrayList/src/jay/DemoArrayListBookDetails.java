package jay;
import java.util.*;
import dhanu.*;
public class DemoArrayListBookDetails 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter the No.of Books-Details You wants to enter...");
			int n = Integer.parseInt(s.nextLine());
			//Creating the ArrayList 
			ArrayList<BookDetails> al = new ArrayList<BookDetails>();
			System.out.println("Enter the "+n+" Books-Details...");
			for(int i=1; i<=n; i++)
			{
				System.out.println("Enter the Book-Code");
				String bc = s.nextLine();
				System.out.println("Enter the Book-Name");
				String bn = s.nextLine();
				System.out.println("Enter the Book-Author");
				String ba = s.nextLine();
				System.out.println("Enter the Book-Price");
				Float bp = Float.parseFloat(s.nextLine());
				System.out.println("Enter the Book-Quantity");
				int bq = Integer.parseInt(s.nextLine());
				al.add(new BookDetails(bc,bn,ba,bp,bq));
			}
			
			
			System.out.println("------BookDetails using Iterator<E>-iterator()-----");
			Iterator<BookDetails> it1 = al.iterator();
			while(it1.hasNext())
			{
				//BookDetails bd = it1.next();
				System.out.println(it1.next());
			}
			
			
			System.out.println("------BookDetails using Iteraror<E>-iterator()-----");
			Iterator<BookDetails> it2 = al.iterator();
			it2.forEachRemaining((k)->
			{
				System.out.println(k.toString());
			});
			
			
			System.out.println("=====ListIterator<E>-listIterator()=====");
			ListIterator<BookDetails> li1 = al.listIterator();
			System.out.println("------Forwrad-------");
			while(li1.hasNext()) 
			{
				BookDetails bd = li1.next();
				System.out.println(bd.toString());
			}//end of loop
			System.out.println("-----Backward-----");
			while(li1.hasPrevious()) 
			{
				BookDetails bd = li1.previous();
				System.out.println(bd.toString());
			}//end of loop
			
			
			System.out.println("=====ListIterator<E>-listIterator(index)=====");
			ListIterator<BookDetails> li2 = al.listIterator(1);
			System.out.println("------Forwrad-------");
			while(li2.hasNext()) 
			{
				BookDetails bd = li2.next();
				System.out.println(bd.toString());
			}//end of loop
			System.out.println("-----Backward-----");
			while(li2.hasPrevious()) 
			{
				BookDetails bd = li2.previous();
				System.out.println(bd.toString());
			}//end of loop
			
			
			System.out.println("=====Spliterator<T>-spliterator()======");
			Spliterator<BookDetails> sp = al.spliterator();
			sp.forEachRemaining((k)->
			{
				System.out.println(k.toString());
			});
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
