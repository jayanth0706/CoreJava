package p2;
import java.util.*;
public class DemoException2
	{
		@SuppressWarnings({ "rawtypes", "deprecation" })
		public static void main(String[] args) throws
		ClassNotFoundException,
		IllegalAccessException,InstantiationException
		{
			Scanner s = new Scanner(System.in);
			try(s;)//Java9

			{
				try
				{
					System.out.println("Enter the Emp-Name:");
					String empName = s.nextLine();
					System.out.println("Enter the Emp-Desg(SE/TE/ME):");

					String desg = s.nextLine();
					Class c = Class.forName("p1.Designation");
					p1.Designation ob = (p1.Designation)c.newInstance();

					ob.verify(desg);
					System.out.println("------EmpDetails-----");
					System.out.println("EmpName:"+empName);
					System.out.println("EmpDesg:"+desg);
				}//end of try
				catch(p1.Designation ds)
				{
					System.out.println(ds.toString());
				}
			}//end of try-with-resource
		}
}