package p1;
public class ProductDetails 
{
	public String code,name;
	public float price;
	public int qty;
	
	public ProductDetails(String code,String name,float price,int qty)
	{
		this.code = code;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	
	public String toString()
	{
		return code+"\t"+name+"\t"+price+"\t"+qty;
	}
	
}
