package p1;
public class DisplayBookDetails
{
	//Instance NonPrimitive datatype variable
	public BookDetails bd = null;
	public DisplayBookDetails(BookDetails bd)
	{
		this.bd = bd;
	}
	public void dis()
	{
		bd.getBookDetails();
	}
}