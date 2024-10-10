package p2;
import java.util.*;
import p1.StudentDetails;
public class DemoStudentDetails 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter the No.of Student-Details You want to enter...");
			int n = Integer.parseInt(s.nextLine());
			ArrayList<StudentDetails> al = new ArrayList<StudentDetails>();
			for(int i=1;i<=n;i++)
			{
				 System.out.println("Enter the Registration-Number:");
	             String sr = s.nextLine();
	             System.out.println("Enter the Student-Name:");
	             String sn = s.nextLine();
	             System.out.println("Enter the Student-Branch:");
	             String sb = s.nextLine();

	             // Input marks for six courses
	             System.out.println("Enter the Student-Marks in First course:");
	             float sc1 = Float.parseFloat(s.nextLine());
	             System.out.println("Enter the Student-Marks in Second course:");
	             float sc2 = Float.parseFloat(s.nextLine());
	             System.out.println("Enter the Student-Marks in Third course:");
	             float sc3 = Float.parseFloat(s.nextLine());
	             System.out.println("Enter the Student-Marks in Fourth course:");
	             float sc4 = Float.parseFloat(s.nextLine());
	             System.out.println("Enter the Student-Marks in Fifth course:");
	             float sc5 = Float.parseFloat(s.nextLine());
	             System.out.println("Enter the Student-Marks in Sixth course:");
	             float sc6 = Float.parseFloat(s.nextLine());

	             // Calculate total marks
	             float st = sc1 + sc2 + sc3 + sc4 + sc5 + sc6;
	             System.out.println("Total Marks: " + st);

	             // Create a new StudentDetails object and add it to the ArrayList
	             StudentDetails student = new StudentDetails(sr, sn, sb, st);
	             al.add(student);  // Add student object to ArrayList
			}
			
			System.out.println("------BookDetails using Iterator<E>-iterator()-----");
			Iterator<StudentDetails> it1 = al.iterator();
			while(it1.hasNext())
			{
				System.out.println(it1.next());
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
