package p1;
public class GenerateBranch
{
	public String gBr=null;
	public String generate(String brCode)
	{
		switch(brCode)
		{
		case "05" : gBr="CSE";
		break;
		case "04" : gBr="ECE";
		break;
		case "02" : gBr="EEE";
		break;

		}//end of switch
		return gBr;
	}
}