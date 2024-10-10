package p1;
//Outer Object
public class Emp 
{
	public String empId,empName,empDesg;
	
	//Method for Emp-Class
	public void getEmployee()
	{
		System.out.println("====Empolyee-Details====");
		System.out.println("Empolyee-Id: "+empId);
		System.out.println("Empolyee-Name: "+empName);
		System.out.println("Empolyee-Designation: "+empDesg);
	}
	
	//Object-Creation For Address-Object
	public Address ad = new Address();
	//Object-Creation For Contact-Object
	public Contact con = new Contact();
	//Object-Creation For Salary-Object
	public Salary sal = new Salary();
}
