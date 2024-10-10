package p2;
import java.util.*;
import p1.Least;
public class Problem3 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter First Interger Value:");
		int v1 = s.nextInt();
		System.out.print("Enter Second Interger Value:");
		int v2 = s.nextInt();
		s.close();
		//Object Creation
		Least ob = new Least();
		int res = ob.getLeastNum(v1, v2);
		System.out.print(res);
		
	}
}
