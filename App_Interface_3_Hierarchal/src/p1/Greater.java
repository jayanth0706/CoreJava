package p1;
public class Greater implements ICalculate
{
	public float process(int x, int y)
	{
		if(x>y)
		{
			return x;
		}
		else if(y>x)
		{
			return y;
		}
		else
		{
			return 0;
		}
	}
}
