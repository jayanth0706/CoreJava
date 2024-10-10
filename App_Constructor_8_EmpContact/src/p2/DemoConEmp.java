package p2;
import java.util.*;
import p1.EmpContact;
public class DemoConEmp 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		EmpContact ob = new EmpContact();
		System.out.println("Enter the Account Number");
		ob.setAccNo(s.nextLong());
		System.out.println("Enter the E-Mail");
		ob.setMail(s.nextLine());
		ob.setMail(s.nextLine());
		System.out.println("Enter the Name");
		ob.setName(s.nextLine());
		System.out.println("Enter the Mobile Number");
		ob.setPhNo(s.nextLong());
		s.close();
		//Printing the output
		System.out.println("Account-Number: "+ob.getAccNo());
		System.out.println("E-Mail: "+ob.getMail());
		System.out.println("Name: "+ob.getName());
		System.out.println("MobileNumber: "+ob.getPhNo());
	}

}
