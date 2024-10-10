package jay;
import java.util.*;
public class DemoList_ArraysList 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			// Creating ArrayList Of Integer
			ArrayList<Integer> al = new ArrayList<Integer>();
			while(true)
			{
				System.out.println("=====Choice(operations on List<E>)=====");
				System.out.println("\t1.add(E)"
								  +"\n\t2.add(index,E)"
								  +"\n\t3.remove(Object)"
								  +"\n\t4.remove(index)"
								  +"\n\t5.get(index)"
								  +"\n\t6.set(index,E)"
								  +"\n\t7.Exit" );
				System.out.println("Enter your choice:");
				int choice = s.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter the element to add to List<E>:");
					al.add(new Integer(s.nextInt()));
					System.out.println("list : "+al.toString());
					break;
				case 2:
					if(al.isEmpty()) {
						System.out.println("List is empty...");
					}else 
					{
						System.out.println("Enter the index to add element:");
						int i1 = s.nextInt();
						if(i1>=0 && i1<=al.size()-1) 
						{
						System.out.println("Enter the element to add by index:");
						al.add(i1, new Integer(s.nextInt()));
						System.out.println("list :"+al.toString());
						}else {
						System.out.println("Invalid index....");
						}
					}
					break;
				case 3:
					if(al.isEmpty()) 
					{
						System.out.println("List is empty....");
					}else 
					{
						System.out.println("Enter the element to remove from list:");
						if(al.remove(new Integer(s.nextInt()))) 
						{
							System.out.println("Element removed Successfully from list...");
							System.out.println("list : "+al.toString());
						}else 
						{
						System.out.println("Element not found in list...");
						}
					}
					break;
				case 4:
					if(al.isEmpty())
					{
						System.out.println("List is Empty....");
					} else
					{
						System.out.println("Enter the Index to remove element...");
						int i2 = new Integer(s.nextInt());
						if(i2>=0 && i2<= al.size()-1)
						{
							al.remove(i2);
							System.out.println("Element is removed SucessFully at Index "+i2);
							System.out.println("List: "+al.toString());
						} else
						{
							System.out.println("Invalid index value...");
						}
					}
					break;
				case 5:
					if(al.isEmpty())
					{
						System.out.println("List is Empty....");
					} else
					{
						System.out.println("Enter the Index to get element...");
						int i3 = new Integer(s.nextInt());
						if(i3>=0 && i3<= al.size()-1)
						{
							Integer el = al.get(i3);
							System.out.println("Element is get SucessFully at Index "+i3+" is "+el);
							System.out.println("List: "+al.toString());
						} else
						{
							System.out.println("Invalid index value...");
						}
					}
					break;
				case 6:
					if(al.isEmpty())
					{
						System.out.println("List is Empty....");
					} else
					{
						System.out.println("Enter the Index to set element...");
						int i4 = new Integer(s.nextInt());
						if(i4>=0 && i4<al.size())
						{
							al.set(i4, new Integer(s.nextInt()));
							System.out.println("Element is get SucessFully at Index "+i4);
							System.out.println("List: "+al.toString());
						} else
						{
							System.out.println("Invalid index value...");
						}
					}
					break;
				case 7:
					System.out.println("Operations stopped on List...");
					System.exit(0);
				default:
					System.out.println("Invalid choice....");
				}
			}
		}
		catch(IndexOutOfBoundsException ioobe)
		{
			System.out.println(ioobe.toString());
		}
	}
}
