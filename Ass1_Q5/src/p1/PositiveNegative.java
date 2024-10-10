package p1;
public class PositiveNegative 
{
	public int findSign(int v1)
	{
		if(v1>0)
		{
			return 1;
		}
		else if(v1==0)
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}
}
