package p2;
import java.util.Scanner;
import p1.Emp;
public class EmpMain 
{
	public static void main(String[] args) 
	{		
		Scanner s = new Scanner(System.in);
		
		//Info.Emp-Class(Outer-Class)
		Emp ob = new Emp();
		System.out.println("Enter Empolyee-Id");
		ob.empId = s.nextLine();
		System.out.println("Enter Empolyee-Name");
		ob.empName = s.nextLine();
		System.out.println("Enter Empolyee-Designation");
		ob.empDesg = s.nextLine();
		
		//Info.Address-Class(Reffered class-1)
		System.out.println("Enter House-Number");
		ob.ad.hNo = s.nextLine();
		System.out.println("Enter Street-Name");
		ob.ad.sName = s.nextLine();
		System.out.println("Enter City");
		ob.ad.city = s.nextLine();
		System.out.println("Enter State");
		ob.ad.state = s.nextLine();
		System.out.println("Enter Pin-Code");
		ob.ad.pinCode = s.nextInt();
		
		//Info.Contanct-Class(Reffered class-2)
		System.out.println("Enter Empolyee E-Mail");
		ob.con.mailId = s.nextLine();
		ob.con.mailId = s.nextLine();
		System.out.println("Enter Empolyee Mobile-Number");
		ob.con.phNo = s.nextLong();
		
		//Info.Salary-Class(Reffered class-3)
		System.out.println("Enter Empolyee Basic-Salary");
		ob.sal.bSal = s.nextFloat();
		
		//Outer Object Class Calling
		ob.getEmployee();
		ob.ad.getAddress();
		ob.con.getContact();
		ob.sal.getSalary();
		s.close();
	}

}
