package p2;
import java.util.*;
import p1.*;
public class DemoRef2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		BookDetails bd = new BookDetails();
		ReadBookDetails rbd = new ReadBookDetails(s,bd);//Con_Call
		DisplayBookDetails dbd = new DisplayBookDetails(bd);//Con_Call
		rbd.read();
		dbd.dis();
		s.close();
	}
}