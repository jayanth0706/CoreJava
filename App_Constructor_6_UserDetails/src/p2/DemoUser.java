package p2;
import java.util.*;
import p1.UserDetails;
public class DemoUser 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		//UserName
		System.out.print("Enter the UserName: ");
		String uName = s.nextLine();
		//Password
		System.out.print("Enter the Password: ");
		String pWord = s.nextLine();
		//First Name
		System.out.print("Enter the First Name: ");
		String fName = s.nextLine();
		//Last Name
		System.out.print("Enter the Last Name: ");
		String lName = s.nextLine();
		//city
		System.out.print("Enter the City Name: ");
		String city = s.nextLine();
		//E-Mail
		System.out.print("Enter the Email Name: ");
		String mId = s.nextLine();
		//Mobile-Number
		System.out.print("Enter the MobileNumber: ");
		long phNo = s.nextLong();
		s.close();
		
		UserDetails ob = new UserDetails(uName,pWord,fName,lName,city,mId,phNo);
		ob.getUserDetails();
	}

}
