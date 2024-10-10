package p2;
import java.util.*;
import p1.ProductDetails;
public class DemoArrays6 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter No.of Product-Details u wants to enter...");
			int n = s.nextInt();
			s.nextLine(); //Cursor to move to new Line
			
			//Creating Array for Product-Details
			ProductDetails arr[] = new ProductDetails[n];
			for(int i=0;i<n;i++)
			{
				System.out.println("====Products-Details of "+i+" ====");
				System.out.println("Enter the Product-Code");
				String pc = s.nextLine();
				System.out.println("Enter the Product-Name");
				String pn = s.nextLine();
				System.out.println("Enter the Product-Price");
				float pp = s.nextFloat();
				System.out.println("Enter the Product-Qty");
				int pq = s.nextInt();
				s.nextLine();
				
				arr[i] = new ProductDetails(pc,pn,pp,pq); 
			}
			for(ProductDetails k : arr)
			{
				System.out.println(k.toString());
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
