package test;
public class StudentValues extends Object
{
	public String name,branch;
	public int totMarks;
	public float per;
	public String result;
	public StudentValues(String name,String branch,int totMarks,float per,String result)
	{
		this.name = name;
		this.branch = branch;
		this.totMarks = totMarks;
		this.per = per;
		this.result = result;
	}
	@Override
	public String toString()
	{
		return name+"\t"+branch+"\t"+totMarks+"\t"+per+"\t"+result;
	}
}