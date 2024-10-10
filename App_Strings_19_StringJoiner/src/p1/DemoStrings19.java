package p1;
import java.util.*;
public class DemoStrings19 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;){
			System.out.println("Enter the delimiter:");
			String dm = s.nextLine();
			StringJoiner sj = new StringJoiner(dm);
			System.out.println("Enter the number of strings to add to StringJoiner:");
			int n = Integer.parseInt(s.nextLine());
			System.out.println("Enter "+n+" String...");
			for(int i=1;i<=n;i++)
			{
				System.out.println("Enter the String-"+i);
				String str = s.nextLine();
				sj.add(str);
			}//end of loop
			System.out.println("======data from StringJoiner====");
			System.out.println(sj.toString());
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}