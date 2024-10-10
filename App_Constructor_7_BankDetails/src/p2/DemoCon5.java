package p2;
import java.util.Scanner;
import p1.BankCustomer;
public class DemoCon5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		//object Creation
		BankCustomer ob = new BankCustomer();
		//Storing Details using "Object-Reference Variable"
		System.out.println("Enter Account Number");
		ob.accNo = Long.parseLong(s.nextLine());
		
		System.out.println("Enter Account Holder Name");
		ob.name = s.nextLine();
		
		System.out.println("Enter Account Balance");
		ob.balance = Float.parseFloat(s.nextLine());
		
		System.out.println("Enter Account Type");
		ob.accType = s.nextLine();
		s.close();
		
		//Calling Method getBankCustomer()
		ob.getBankCustomer();
	}
}
