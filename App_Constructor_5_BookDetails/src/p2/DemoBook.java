package p2;
import java.util.Scanner;
import p1.BookDetails;
public class DemoBook
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Book-code:");
		String bC = s.nextLine();
		System.out.println("Enter the Book-Name: ");
		String bN = s.nextLine();
		System.out.println("Enter the Book-Author: ");
		String bA = s.nextLine();
		System.out.println("Enter the Book-Price: ");
		float bP = s.nextFloat();
		System.out.println("Enter the Book-Qty: ");
		int bQ = s.nextInt();

		BookDetails bd = new BookDetails(bC,bN,bA,bP,bQ);//Con_Call
		bd.getBookDetails();
		s.close();
	}
}
