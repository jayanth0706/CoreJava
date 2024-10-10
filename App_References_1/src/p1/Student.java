package p1;
public class Student
{
	public String rollNo,name,branch;
	public Address ad = new Address();
	public void getStudent()
	{
		System.out.println("====Student-Data====");
		System.out.println("Stu-RollNO:"+rollNo);
		System.out.println("Stu-Name:"+name);
		System.out.println("Stu-Branch:"+branch);
	}
}