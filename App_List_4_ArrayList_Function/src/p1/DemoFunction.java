package p1;
import java.util.*;
import java.util.function.*;
public class DemoFunction {
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			ArrayList<Float> al = new ArrayList<Float>();
			System.out.println("Enter the number of elements:");
			int n = s.nextInt();
			System.out.println("-----Enter "+n+" elements-----");
				for(int i=1;i<=n;i++) 
				{
					al.add(new Float(s.nextFloat()));
				}//end of loop
				System.out.println("List : "+al.toString());
				System.out.println("-----Display elements from list incremented by 30%-----");
				Function<Float,Float> fn = (x)->
				{
					return x+(0.3F*x);
				};
				al.forEach((k)->
				{
					System.out.print(fn.apply(k)+" ");
				});
				System.out.println("\nOriginal List : "+al.toString());
				System.out.println("=======replaceAll()========");
				al.replaceAll((x)->
				{
					return x+(0.5F*x);
				});
				System.out.println("Original List : "+al.toString());
			}
			catch(Exception e) 
			{
				System.out.println(e.toString());
			}
	}

}
