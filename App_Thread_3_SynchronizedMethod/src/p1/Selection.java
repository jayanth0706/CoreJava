package p1;
public class Selection
{
	public synchronized void select(int n,String name)
	{
		if(n<=Available.tickets) {
			System.out.println(n+" Tickets booked by "+name);
			Available.tickets = Available.tickets-n;
		}else {
			System.out.println("Sorry ! No Tickets available for "+name);
		}
	}
}