package p2;
import java.util.*;
import p1.Rounder;
public class Problem4 {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Interger Value:");
		int v1 = s.nextInt();
		s.close();
		//Object Creation
		Rounder ob = new Rounder();
		int result = ob.oddRounder(v1);
		System.out.println(result);
	}

}
