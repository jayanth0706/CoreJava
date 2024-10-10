package p2;
import java.util.*;
import p1.Greatest;
public class Problem2 {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the First Interger Value: ");
		int v1 = s.nextInt();
		System.out.print("Enter the Second Interger Value: ");
		int v2 = s.nextInt();
		s.close();
		//Object Creation
		Greatest ob = new Greatest();
		int res = ob.getGreatest(v1, v2);
		System.out.println(res);
	}

}
