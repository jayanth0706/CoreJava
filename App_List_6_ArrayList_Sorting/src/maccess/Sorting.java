package maccess;
import java.util.*;
@SuppressWarnings("rawtypes")
public class Sorting implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Integer ob1 = (Integer)o1;
		Integer ob2 = (Integer)o2;
		if(ob1==ob2) return 0;
		else if(ob1>ob2) return 1;
		else return -1;
	}
}