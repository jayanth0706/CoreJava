package p1;
import java.util.*;
public class DemoList1 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			//Creating Array List for Integer
			ArrayList<Integer> al = new ArrayList<Integer>();
			while(true) 
			{
				System.out.println("=====Choice(operations-List<E>)=====");
				System.out.println("\\t1.add(E)"
									+ "\n\t2.add(index,E)"
									+ "\n\t3.remove(Object)"
									+ "\n\t4.remove(index)"
									+ "\n\t5.get(index)"
									+ "\n\t6.set(index,E)"
									+ "\n\t7.Exit");
				System.out.println("Enter your choice:");
				int choice = s.nextInt();
				switch(choice) 
				{
				case 1:
					System.out.println("Enter the element to add to List<E>");
					//Adding Inputs from user in ArrayList
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
							//Adding Elements by ArrayList Index Value
							al.add(i1, new Integer(s.nextInt()));
							System.out.println("list : "+al.toString());
						}else 
						{
							System.out.println("Invalid index....");
						}
					}
					break;
				case 3:
					if(al.isEmpty()) 
					{
						System.out.println("List is empty...");
					}else 
					{
						System.out.println("Enter the element to remove from list:");
						if(al.remove(new Integer(s.nextInt()))) {
							System.out.println("Element removed Successfully from list...");
							System.out.println("list : "+al.toString());
						}else 
						{
							System.out.println("Element not found in list...");
						}
					}
					break;
				case 4:
					if(al.isEmpty()) {
						System.out.println("list is empty...");
					}else 
					{
						System.out.println("Enter the index to remove the element:");
						int i2 = s.nextInt();
						if(i2>=0 && i2<=al.size()-1) 
						{
							al.remove(i2);
							System.out.println("Element removed Successfully...");
							System.out.println("list :"+al.toString());
						}else 
						{
							System.out.println("Invalid index value...");
						}
					}
					break;
				case 5:
					if(al.isEmpty()) {
						System.out.println("list is empty....");
					}else 
					{
						System.out.println("Enter the index to get element from list:");
						int i3 = s.nextInt();
						if(i3>=0 && i3<=al.size()) 
						{
							Integer el = al.get(i3);
							System.out.println("Element at index"+i3+" is "+el.toString());
							System.out.println("list : "+al.toString());
						}else 
						{
							System.out.println("Invalid index value...");
						}
						}
					break;
				case 6:
					if(al.isEmpty()) {
						System.out.println("List is empty....");
					}else 
					{
						System.out.println("Enter the index to set element:");
						int i4 = s.nextInt();
						if(i4>=0 && i4<=al.size()) 
						{
							System.out.println("Enter the element to set by index:");
							al.set(i4, new Integer(s.nextInt()));
							System.out.println("Element setted to List successfully...");
							System.out.println("list : "+al.toString());
						}else 
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
				}//end of switch
			}//end of loop
		}catch(Exception e) 
		{
			System.out.println(e.toString());
		}
	}
}
