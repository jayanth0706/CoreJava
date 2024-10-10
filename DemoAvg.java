class Average
{ 
	float avg(int a, int b)
	{
		float person_avg = (float) (a+b)/2;
		return person_avg;
	}
}

class DemoAvg
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int v1 = 23;
		int v2 = 40;
		
		// Creation of object
		Average ob = new Average();
		float res = ob.avg(v1, v2);
		System.out.println(res);
	}
}
