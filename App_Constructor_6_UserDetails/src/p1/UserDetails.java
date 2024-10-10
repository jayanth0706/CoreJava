package p1;
public class UserDetails 
{
	public String uName,pWord,fName,lName,city,mId;
	public long phNo;
	
	//Constructor for User-Details:
	public UserDetails(String uName, String pWord, String fName, String lName, String city, String mId, long phNo)
	{
		this.uName = uName;
		this.pWord = pWord;
		this.fName = fName;
		this.lName = lName;
		this.city = city;
		this.mId = mId;
		this.phNo = phNo;
	}
	
	//Method getUserDetails()
	public void getUserDetails()
	{
	System.out.println("-----UserDetails----");
	System.out.println("UserName: "+uName);
	System.out.println("PassWord: "+pWord);
	System.out.println("FirstName:"+fName);
	System.out.println("LastName: "+lName);
	System.out.println("City: "+city);
	System.out.println("MailId: "+mId);
	System.out.println("PhoneNo:"+phNo);
	}
}
