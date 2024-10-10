package p1;
public class BankCustomer 
{
	public long accNo;
	public String name;
	public float balance;
	public String accType;
	
	public void getBankCustomer()
	{
		System.out.println("----BankCutomer Details-----");
		System.out.println("AccountNo: "+accNo);
		System.out.println("Customer-Name: "+name);
		System.out.println("Balance: "+balance);
		System.out.println("Account-Type: "+accType);
	}
	
}
