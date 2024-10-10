package p1;
public class Rounder
{
	public int oddRounder(int v1)
	{
		if(v1<0)
		{
			return -1;
		}
		else if(v1==0)
		{
			return -2;
		}
		else if(v1%2==0)
		{
			return v1;
		}
		else
		{
			int r = v1%10;
			int c = 10;
			int s = c-r;
			int result = v1+s;
			return result;
		}
	}
}
