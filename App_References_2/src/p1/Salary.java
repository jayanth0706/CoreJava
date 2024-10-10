package p1;
//Reffered object-3
public class Salary 
{
	public float bSal,hra,da,tSal;//34000
	
	//Method for Salary-Class
	public void getSalary()
	{
		hra = ((73*bSal)/100);//24820
		da = ((63*bSal)/100);//21420
		tSal = (bSal+hra+da);//80240
		System.out.println("====Empolyee-Salary====");
		System.out.println("Basic Salary: "+bSal);
		System.out.println("HRA Salary: "+hra);
		System.out.println("DA Salary: "+da);
		System.out.println("Total Salary: "+tSal);
	}
	
}
