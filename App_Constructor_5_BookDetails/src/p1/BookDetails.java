package p1;
public class BookDetails
{
	public String code,name,author;
	public float price;
	public int qty;
	public BookDetails(String code,String name,String author,float price,int qty)
	{
		this.code = code;
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	public void getBookDetails()
	{
		System.out.println("-----BookDetails----");
		System.out.println("BookCode: "+code);
		System.out.println("BookName: "+name);
		System.out.println("BookAuthor: "+author);
		System.out.println("BookPrice: "+price);
		System.out.println("BookQty: "+qty);
	}
}