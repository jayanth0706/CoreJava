package maccess;
import java.util.*;
public class DemoSet 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;){
			Set<Integer> ob = null;
			String nm = null;
			while(true) {
				System.out.println("-----Choice-----");
				System.out.println("\t1.HashSet"
						+ "\n\t2.LinkedHashSet"
						+ "\n\t3.TreeSet"
						+ "\n\t4.Exit");
				System.out.println("Enter your Choice:");
				switch(s.nextInt()) {
				case 1:
					ob = new HashSet<Integer>();
					nm = "HashSet";
					break;
				case 2:
					ob = new LinkedHashSet<Integer>();
					nm = "LinkedHashSet";
					break;
				case 3:
					ob = new TreeSet<Integer>();
					nm = "TreeSet";
					break;
				case 4:
					System.out.println("Program stopped....");
					System.exit(0);
				default:
					System.out.println("Invalid Choice...");
					continue;
				}//end of switch
				System.out.println("Perform operations on "+nm);
				pqr : while(true) 
				{
					System.out.println("=====Choice(Operations on "+nm+")====");
					System.out.println("\t1.add(E)"
							+ "\n\t2.remove(Object)"
							+ "\n\t3.Exit");
					System.out.println("Enter your Choice:");
					switch(s.nextInt()) {
					case 1:
						System.out.println("Enter the ele to add to " +nm);
						ob.add(new Integer(s.nextInt()));
						System.out.println("Elements in "+nm+" : "+ob.toString());
						break;
					case 2:
						if(ob.isEmpty()) {
							System.out.println(nm+" is empty....");
						}else {
							System.out.println("Enter the ele to remove from "+nm);
							Integer ele = new Integer(s.nextInt());
							if(ob.remove(ele)) {
								System.out.println("Element removed from "+nm);
								System.out.println("Elements in "+nm+" : "+ob.toString());
							}else {
								System.out.println("Element not found in "+nm);
								System.out.println("Elements in "+nm+" : "+ob.toString());
							}
						}
						break;
					case 3:
						System.out.println("Operations stopped on "+nm);
						break pqr;
					default:
						System.out.println("Invalid choice...");
					}//end of switch
				}//end of InnerLoop
			}//end of loop
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}