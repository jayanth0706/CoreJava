package p2;
import java.util.*;
import p1.*;
@SuppressWarnings("serial")
public class DemoStings7 extends Exception
	{
	public DemoStings7(String msg)
	{
		super(msg);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter the StuName:");
			String stuName = s.nextLine();
			System.out.println("Enter the StuRollNo:");
			String rollNo = s.nextLine();
			if(rollNo.length()!=10)//Exception Condition
			{
				throw new DemoStings7("Invalid rollNo...");
			}
			String brCode = rollNo.substring(6, 8);
			GenerateBranch gb = new GenerateBranch();
			String gBr = gb.generate(brCode);
			if(gBr==null)//Exception Condition
			{
				throw new DemoStings7("RollNo holding Invalid branchCode...");
			}
			System.out.println("Enter the Branch(CSE/ECE/EEE):");
			String branch = s.nextLine().toUpperCase();
			BranchCheck bc = new BranchCheck();
			boolean k = bc.verify(branch);
			if(!k)//Exception Condition
			{
				throw new DemoStings7("Invalid Branch....");
			}
			boolean b = gBr.equals(branch);
			if(!b)//Exception Condition
			{
				throw new DemoStings7("RollNo not belongs to Branch....");
			}
			System.out.println("-------Enter 6 Subject Marks-----");
			int i=1,totM=0;
			boolean q=false;
			while(i<=6)
			{
				try
				{
					System.out.println("Enter the Marks of Subject-"+i);
					int sub = s.nextInt();
					if(sub<0 || sub>100)//Exception Condition
					{
						throw new DemoStings7("Invalid Marks...");
					}
					if(sub>=0 && sub<=34)
					{
						q=true;
					}

					totM = totM+sub;
					i++;
				}//end of try
				catch(Exception e)
				{
					System.out.println(e.toString());
				}

			}//end of loop
			System.out.println("******StudentDetails*****");
			System.out.println("StudentName:"+stuName);
			System.out.println("StudentRollNo:"+rollNo);
			System.out.println("StudentBranch:"+branch);
			System.out.println("TotalMarks:"+totM);
			float per = (float)totM/6;
			System.out.println("Percentage:"+per);
			StudentResult sr = new StudentResult();
			String res = sr.generateResult(per,q);
			System.out.println("Result:"+res);
		}//end of try with resource
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

	}
}