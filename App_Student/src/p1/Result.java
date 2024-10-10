package p1;

public class Result 
{
	public String generate(float per)
	{
		if(per>=70 && per<=100)
		{
			return "====DISTINCTION====";
		}
		else if(per>=60 && per<70)
		{
			return "====FIRST-CLASS====";
		}
		else if(per>=50 && per<60)
		{
			return "====SECOND-CLASS====";
		}
		else if(per>=35 && per<50)
		{
			return "====THRID-CLASS====";
		}
		else
		{
			return "====FAIL====";
		}
	}
}
