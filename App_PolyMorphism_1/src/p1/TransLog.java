package p1;
import java.util.*;
public final class TransLog
{
	private final long hAccNo,bAccNo;
	private final float amt;
	private final Date dTime;
	public TransLog(long hAccNo,long bAccNo,float amt,Date dTime)
	{
		this.hAccNo = hAccNo;
		this.bAccNo = bAccNo;
		this.amt = amt;
		this.dTime = dTime;
	}
	public final long gethAccNo() 
	{
		return hAccNo;
	}
	public final long getbAccNo() 
	{
		return bAccNo;
	}
	public final float getAmt() 
	{
		return amt;
	}
	public final Date getdTime() 
	{
		return dTime;
	}
}