package p1;
import java.util.*;
public class Registration implements Runnable
	{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Reg_proc_by_Alex..."+new Date());
			try {
				Thread.sleep(2000);
			}catch(Exception e) {e.printStackTrace();}
		}//end of loop
	}
}