package p1;
import java.util.Scanner;
public class ReadBookDetails
{
//Instance NonPrimitive datatype variables
	public Scanner s = null;
	public BookDetails bd = null;
	public ReadBookDetails(Scanner s,BookDetails bd)
	{
		this.s = s;
		this.bd = bd;
	}
	public void read()
	{
		System.out.println("Enter the Book-Code:");
		bd.code = s.nextLine();
		System.out.println("Enter the Book-Name:");
		bd.name = s.nextLine();
		System.out.println("Enter the Book-Author:");
		bd.author = s.nextLine();
		System.out.println("Enter the Book-Price:");
		bd.price = s.nextFloat();
		System.out.println("Enter the Book-Qty:");
		bd.qty = s.nextInt();
	}
}