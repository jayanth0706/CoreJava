package p1;
public class StudentResult
{
	public String generateResult(float per,boolean q)
	{
		if(q) return "Fail";
		else if(per>=70 && per<=100) return "Distinction";
		else if(per>=60 && per<70) return "FirstClass";
		else if(per>=50 && per<60) return "SecondClass";
		else return "ThirdClass";
	}
}