package p2;
import p1.Addition;
import p1.Average;
import java.util.Scanner;

public class DemoMain {

	public static void main(String[] args) {
		System.out.println("Welcome to App_Calculations");
		//Creating Scanner Object
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Int value-1:");
		int v1 = s.nextInt();
		System.out.println("Enter the Int value-2:");
		int v2 = s.nextInt();
		//Providing Two Options: 1.Addition 2.Average:
		System.out.println("====Choose Your Option====");
		System.out.println("\t1.Addition \n\t2.Average");
		int choice = s.nextInt();
		System.out.print("Your choosen option:" +choice);
		//Applying SwitchCase for the Addition Class and Average Class:
		switch(choice)
		{
		case 1:
			Addition ad = new Addition();
			int FinalAddition = ad.add(v1,v2);
			System.out.println("Addition of x and y is "+FinalAddition);
			break;
		case 2:
			Average av = new Average();
			float FinalAverage = av.avg(v1,v2);
			System.out.println("Average of x and y is "+FinalAverage);
			break;
		default:
			System.out.println("====INVALID OPTION====");
		}
	}
}
