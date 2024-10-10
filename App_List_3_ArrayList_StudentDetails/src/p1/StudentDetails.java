package p1;
public class StudentDetails 
{
	public String rollNo,name,branch;
	public float totMarks,percentage;
	public String grade;
	
	public float m1(float totMarks)
	{
		return (0.2f*(totMarks/6));
	}
	
	public String m2(float percentage)
	{
		if(percentage>=90 && percentage<=100)
		{
			return "O Grade";
		}
		else if(percentage>=80 && percentage<90)
		{
			return "A+ Grade";
		} 
		else if(percentage>=70 && percentage<80)
		{
			return "A Grade";
		} 
		else if(percentage>=60 && percentage<70)
		{
			return "B+ Grade";
		} 
		else if(percentage>=50 && percentage<60)
		{
			return "B Grade";
		} 
		else if(percentage>=40 && percentage<50)
		{
			return "C Grade";
		} 
		else 
		{
			return "Fail...";
		}
	}
	
	public StudentDetails(String rollNo, String name, String branch,float totMarks)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
		this.totMarks = totMarks;
		this.percentage = m1(totMarks);  // Calculate percentage from total marks
		this.grade = m2(this.percentage); // Calculate grade from percentage
	}
	
	public String toString()
	{
		return rollNo+"\t\t"+name+"\t\t"+branch+"\t\t"+totMarks+"\t\t"+percentage+"\t\t"+grade;
	}
}
