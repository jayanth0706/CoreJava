package p1;
public class User1 implements Runnable
{
	@Override
	public void run()
	{
		Selection.select(1, "Alex");
	}
}