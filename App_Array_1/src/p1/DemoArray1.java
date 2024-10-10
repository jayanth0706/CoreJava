package p1;
import java.util.*;
public class DemoArray1 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;){
			System.out.println("Enter the number of Integer elements:");
			int n = s.nextInt();
			Integer arr[] = new Integer[n];
			System.out.println("Enter "+n+" Integer elements...");
			for(int i=0;i<n;i++)
			{
				arr[i] = new Integer(s.nextInt());
			}
			System.out.println("======Display using Old for loop=====");
			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i].toString()+" ");
			}
			System.out.println("\n=====Extended for(Java5)======");
			for(Integer k : arr)
			{
				System.out.print(k.toString()+" ");
			}
			System.out.println("\n=====Spliterator<T>(Java8)=======");
			Spliterator<Integer> sp = Arrays.spliterator(arr);
			sp.forEachRemaining((k)->
			{
				System.out.print(k.toString()+" ");
			});
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}