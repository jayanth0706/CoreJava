package p2;
import java.util.*;
import p1.TransLog;
public class DemoPoly3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter hAccNo:");
			long hAccNo = s.nextLong();
			System.out.println("Enter bAccNo:");
			long bAccNo = s.nextLong();
			System.out.println("Enter the Amt to transfer:");
			float amt = s.nextFloat();

			TransLog ob = new TransLog(hAccNo,bAccNo,amt,new Date());
			//Immutable Object
			System.out.println("----Display Trans-Details-----");
			System.out.println("HAccNO:"+ob.gethAccNo());
			System.out.println("BAccNO:"+ob.getbAccNo());
			System.out.println("Amount:"+ob.getAmt());
			System.out.println("DateTime:"+ob.getdTime());
		}//end of try with resource
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}