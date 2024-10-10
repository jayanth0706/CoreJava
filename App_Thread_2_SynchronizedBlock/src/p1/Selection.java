package p1;
public class Selection
{

public void select(int n,String name)
{
	if(n<=Avaiable.tickets) {
		System.out.println(n+" Tickets booked by "+name);
		Avaiable.tickets = Avaiable.tickets-n;
	}else 
	{
		System.out.println("Sorry ! No Tickets available for "+name);
	}
	}
}