class EmployeeSalary
{
	int emp (int s1,int s2,int s3)
	{
		int z = (s1 + s2 + s3);
		return z;
	}	
}
class DemoEmployee 
{
	public static void main(String[] args) 
	{
		int bsal = 34000;
		int hra = 73*340;
		System.out.println(hra);
		int da = 63*340;
		System.out.println(da);
		
		
		EmployeeSalary ob = new EmployeeSalary();
		int res = ob.emp(bsal,hra,da);
		System.out.println(res);
	}
}