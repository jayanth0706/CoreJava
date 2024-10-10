package p1;
public class BookDetails
{
	public String code,name,author;
	public float price;
	public int qty;
	public void getBookDetails()
	{
		System.out.println("-----BookDetails----");
		System.out.println("Book-Code: "+code);
		System.out.println("Book-Name: "+name);
		System.out.println("Book-Author: "+author);
		System.out.println("Book-Price: "+price);
		System.out.println("Book-Qty: "+qty);
	}
}