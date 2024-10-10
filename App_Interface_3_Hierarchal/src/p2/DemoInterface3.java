package p2;
import java.util.*;
import p1.*;
public class DemoInterface3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value-1");
		int v1 = s.nextInt();
		System.out.println("Enter the Value-2");
		int v2 = s.nextInt();
		System.out.println("====Choice Your Option====");
		System.out.println("====1.Addition===="+"\n====2.Average===="+"\n====3.Greater====");
		int choice = s.nextInt();
		s.close();
		switch(choice)
		{
		case 1:
			Addition add = new Addition();
			float r1 = add.process(v1,v2);
			System.out.println("Addition of X and Y: "+r1);
			break;
		case 2:
			Average avg = new Average();
			float r2 = avg.process(v1,v2);
			System.out.println("Addition of X and Y: "+r2);
			break;
		case 3:
			Greater gt = new Greater();
			float r3 = gt.process(v1,v2);
			System.out.println("Addition of X and Y: "+r3);
			break;
		default:
			System.out.println("====Invalid Choice====");
		}
	}

}
