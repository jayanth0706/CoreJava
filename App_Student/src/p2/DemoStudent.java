package p2;
import java.util.Scanner;
import p1.Percentage;
import p1.Result;

public class DemoStudent {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the marks of Sub-1");
		int v1 = s.nextInt();
		System.out.println("Enter the marks of Sub-2");
		int v2 = s.nextInt();
		System.out.println("Enter the marks of Sub-3");
		int v3 = s.nextInt();
		System.out.println("Enter the marks of Sub-4");
		int v4 = s.nextInt();
		System.out.println("Enter the marks of Sub-5");
		int v5 = s.nextInt();
		System.out.println("Enter the marks of Sub-6");
		int v6 = s.nextInt();
		s.close();
		int totalMarks = v1+v2+v3+v4+v5+v6;
		
		if((v1>=0 && v1<=100)&&(v2>=0 && v2<=100)&&(v3>=0 && v3<=100)&&
			(v4>=0 && v4<=100)&&(v5>=0 && v5<=100)&&(v6>=0 && v6<=100))
		{
			//object Creation for percentage class:
			Percentage ob1 = new Percentage();
			float per = ob1.cal(totalMarks);
			System.out.println("Percentage of a Student is "+per);
			//object Creation for Result class:
			Result ob2 = new Result();
			String res = ob2.generate(per);
			System.out.println("Final Grade of a Student is "+res);
		}
		else 
		{
			System.out.println("====INVALID MARKS====");
		}
	}

}
