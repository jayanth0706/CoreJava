package p1;
public class BranchCheck
{
	public boolean k=false;
	public boolean verify(String branch)
	{
		switch(branch)
		{
		case "CSE":k=true;
		break;
		case "ECE":k=true;
		break;
		case "EEE":k=true;
		break;
		}//end of switch
		return k;
	}
}