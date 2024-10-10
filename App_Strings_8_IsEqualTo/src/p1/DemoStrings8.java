package p1;
import java.util.*;
public class DemoStrings8 
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;){
			System.out.println("Enter the String-1:");
			String str1 = s.nextLine();
			System.out.println("Enter the String-2:");
			String str2 = s.nextLine();
			int k = str1.compareTo(str2);
			if(k==0) {
				System.out.println("Strings are equal...");
			}else if(k>0) {
				System.out.println(str1+" is greater than "+str2);
			}else {
				System.out.println(str1+" is less than "+str2);
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}