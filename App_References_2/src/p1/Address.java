package p1;
//Reffered Object-1
public class Address 
{
	public String hNo,sName,city,state;
	public int pinCode;
	//Method for Address-Class
	public void getAddress()
	{
		System.out.println("====Empolyee-Address====");
		System.out.println("H:No:- "+hNo);
		System.out.println("Street Name: "+sName);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Pin-Code: "+pinCode);
	}
}
