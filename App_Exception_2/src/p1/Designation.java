package p1;
@SuppressWarnings("serial")

public class Designation extends Exception
{
	public Designation() {}
	public Designation(String msg)
	{
		super(msg);
	}
	public void verify(String desg)throws Designation
	{
		try
		{
			switch(desg)
			{
			case "SE":
				break;
			case "TE":
				break;
			case "ME":
				break;
			default : //Exception condition
				Designation dg = new Designation("Invalid emp desg...");
				throw dg;
			}//end of switch
		}//end of try
		catch(Designation dg)
			{
			throw dg;//Exception re-throwing
			}
	}
}