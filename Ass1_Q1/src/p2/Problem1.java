package p2;
import java.util.*;
import p1.EvenOdd;
public class Problem1 {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Interger Value:");
		int v1 = s.nextInt();
		s.close();
		//Object Creation
		EvenOdd ob = new EvenOdd();
		int res = ob.isEven(v1);
		System.out.println("====1->Even====\n====0->Odd====");
		System.out.println(res);
	}

}
