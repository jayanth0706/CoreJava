package p2;
import java.util.Scanner;
import p1.Addition;
import p1.Subtraction;
import p1.Multiplication;
import p1.Division;
import p1.ModuloDivision;
public class DemoArithmetic {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the First Integer Value: ");
		int v1 = s.nextInt();
		System.out.print("\nEnter the Second Interger Value: ");
		int v2 = s.nextInt();
		System.out.println("====Enter Your Choice====");
		System.out.println("====1.Addition====\n====2.Subtraction====\n====3.Multiplication====\n====4.Division====\n====5.ModuloDivision====");
		int choice = s.nextInt();
		s.close();
		
		switch(choice)
		{
		case 1:
			Addition add = new Addition();
			int Aresult = add.m1(v1,v2);
			System.out.println("Addition of v1 and v2:"+Aresult);
			break;
		case 2:
			Subtraction sub = new Subtraction();
			int Sresult = sub.m2(v1,v2);
			System.out.println("Subtraction of v1 and v2:"+Sresult);
			break;
		case 3:
			Multiplication mul = new Multiplication();
			int Mresult = mul.m3(v1,v2);
			System.out.println("Multiplication of v1 and v2:"+Mresult);
			break;
		case 4:
			Division div = new Division();
			int Dresult = div.m4(v1,v2);
			System.out.println("Division of v1 and v2:"+Dresult);
			break;
		case 5:
			ModuloDivision moddiv = new ModuloDivision();
			int MDresult = moddiv.m5(v1,v2);
			System.out.println("Addition of v1 and v2:"+MDresult);
			break;
		default :
			System.out.println("====INVALID OPTION====");
		}

	}

}
