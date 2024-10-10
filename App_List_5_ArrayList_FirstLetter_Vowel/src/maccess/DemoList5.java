package maccess;
import java.util.*;
import java.util.function.*;;
public class DemoList5 
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;){
			ArrayList<String> al = new ArrayList<String>();
			System.out.println("Enter the number Strings:");
			int n = Integer.parseInt(s.nextLine());
			System.out.println("Enter "+n+" Strings...");
			for(int i=1;i<=n;i++)
			{
				al.add(new String(s.nextLine()));
			}//end of loop
			System.out.println("List : "+al.toString());
			System.out.println("-----Strings started with Vowel---");
			Predicate<String> pd = (x)->
			{
					char ch = x.charAt(0);
					return switch(ch)
							{
							case 'a': yield true;
							case 'A': yield true;
							case 'e': yield true;
							case 'E': yield true;
							case 'i': yield true;
							case 'I': yield true;
							case 'o': yield true;
							case 'O': yield true;
							case 'u': yield true;
							case 'U': yield true;
							default : yield false;
							};
			};
			al.forEach((k)->
			{
				if(pd.test(k))
				{
					System.out.print(k.toString()+" ");
				}
			});
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}