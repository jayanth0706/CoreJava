package p2;
import java.util.Scanner;
import p1.Student;
public class DemoRef1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Student ob = new Student();
		
		System.out.println("Enter the Stu-RollNo:");
		ob.rollNo = s.nextLine();
		System.out.println("Enter the Stu-Name:");
		ob.name = s.nextLine();
		System.out.println("Enter the Stu-Branch:");
		ob.branch = s.nextLine();
		System.out.println("Enter the Stu-HNO:");
		ob.ad.hNo = s.nextLine();
		System.out.println("Enter the Stu-SName:");
		ob.ad.sName = s.nextLine();
		System.out.println("Enter the Stu-City:");
		ob.ad.city = s.nextLine();
		System.out.println("Enter the Stu-State:");
		
		ob.ad.state = s.nextLine();
		System.out.println("Enter the Stu-PinCode:");
		ob.ad.pinCode = s.nextInt();
		
		ob.getStudent();
		ob.ad.getAddress();

		s.close();
	}
}