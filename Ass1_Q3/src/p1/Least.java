package p1;
public class Least {
	public int getLeastNum(int v2, int v1)
	{
		if(v1<0 || v2<0)
		{
			return -1;
		}
		else if(v1==0 || v2==0)
		{
			return -2;
		}
		else if(v1==v2)
		{
			return 0;
		}
		else if(v1<v2)
		{
			return v1;
		}
		else
		{
			return v2;
		}
	}

}
