package p2;
import java.util.*;
import p1.EmpolyeeDetails;
public class DemoArrays6 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter No.Of Empolyee Details U wants to enter..");
			int n = s.nextInt();
			s.nextLine(); // Consume the newline
			//Creating Array for Displaying Empolyee-Details
			EmpolyeeDetails arr[] = new EmpolyeeDetails[n];
			//Getting input for Users
			for(int i=0;i<n;i++)
			{
				System.out.println("====Empolyee-Details====");
				System.out.println("Enter the Emp-Id:");
				String empId = s.nextLine();
				System.out.println("Enter the Emp-Name");
				String empName = s.nextLine();
				System.out.println("Enter the Emp-Designation");
				String empDsgn = s.nextLine();
				System.out.println("Enter the Emp-BasicSalary");
				float empBsal = s.nextFloat();
				s.nextLine(); // Consume the newline
				
				arr[i] = new EmpolyeeDetails(empId, empName, empDsgn, empBsal);
			}
			System.out.println("=====Empolyee-Details using Extended-for");
			for(EmpolyeeDetails k : arr)
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
