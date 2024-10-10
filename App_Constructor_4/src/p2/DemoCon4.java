package p2;
import java.util.Scanner;
import p1.Student;
public class DemoCon4
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Student ob = new Student();//Object Creation with default values

		//Loading data to object using Setter methods
		System.out.println("Enter the Stu-Name: ");
		ob.setName(s.nextLine());
		System.out.println("Enter the Stu-RollNo: ");
		ob.setRollNo(s.nextLine());
		System.out.println("Enter the Stu-Branch: ");
		ob.setBranch(s.nextLine());

		//Getting the data from Object using Getter methods
		String nm = ob.getName();
		String rNo = ob.getRollNo();
		String br = ob.getBranch();

		System.out.println("-----Details-----");
		System.out.println("StuName:"+nm);
		System.out.println("StuRollNo: "+rNo);
		System.out.println("StuBranch: "+br);

		s.close();
	}
}