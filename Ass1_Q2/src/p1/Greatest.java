package p1;
public class Greatest 
{
	public int getGreatest(int v1, int v2)
	{
		if((v1<0)||(v2<0))
		{
			return -1;
		}
		else if((v1==0)||(v2==0))
		{
			return -2;
		}
		else if(v1==v2)
		{
			return 0;
		}
		else if(v1>v2)
		{
			return v1;
		}
		else
		{
			return v2;
		}
	}
}
