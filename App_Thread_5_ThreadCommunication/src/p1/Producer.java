package p1;
public class Producer implements Runnable
{
public StringBuffer sb = null;
public Producer(StringBuffer sb)
{
	this.sb=sb;
	}
	@Override
	public void run()
	{
		try {
			synchronized(sb) {
				for(int i=1;i<=10;i++) {
					sb.append(i+":");
					System.out.println("Producer....Appending data to buffer....");
					Thread.sleep(2000);
				}//end of loop
				sb.notify();
			}//end of lock
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}