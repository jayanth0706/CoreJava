package p1;
import java.util.Date;
public class Login implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Log_proc_by_Ram..."+new Date());
			try {
				Thread.sleep(2000);
			}catch(Exception e) {e.printStackTrace();}
		}//end of loop
	}
}