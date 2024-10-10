package p2;
import java.util.*;
import p1.PositiveNegative;
public class Problem5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Interger value:");
		int v1 = s.nextInt();
		s.close();
		//Object Creation
		PositiveNegative ob = new PositiveNegative();
		int res = ob.findSign(v1);
		System.out.println(res);
	}

}
