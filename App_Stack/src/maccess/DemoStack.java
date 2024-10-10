package maccess;
import java.util.*;
public class DemoStack 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		try(s;){
			Stack<Integer> ob = new Stack<Integer>();
			while(true) {
				System.out.println("=====Choice(Stack operations)====");
				System.out.println("\t1.push(E)"
					+ "\n\t2.pop()"
					+ "\n\t3.peek()"
					+ "\n\t4.search(Object)"
					+ "\n\t5.Exit");
				System.out.println("Enter your choice:");
				switch(s.nextInt()) 
				{
				case 1:
					System.out.println("Enter the ele to add to Stack:");
					ob.push(new Integer(s.nextInt()));
					System.out.println("Elements in Stack : "+ob.toString());
					break;
				case 2:
					if(ob.empty()) {
						System.out.println("Stack is empty...");
					}else {
						ob.pop();
						System.out.println("Element deleted from top-of-stack...");
						System.out.println("Elements in Stack : "+ob.toString());
					}
					break;
				case 3:
					if(ob.empty()) {
						System.out.println("Stack is empty...");
					}else {
						System.out.println("peek element: "+ob.peek());
						System.out.println("Elements in Stack : "+ob.toString());
					}
					break;
				case 4:
					if(ob.empty()) {
						System.out.println("Stack is empty...");
					}else {
						System.out.println("Enter the element to search from Stack: ");

						Integer ele = new Integer(s.nextInt());
						int pos = ob.search(ele);
						if(pos>0) {
							System.out.println(ele+" found at position "+pos);
						}else {
							System.out.println("Element not found in Stack<E>...");
						}
					}
					break;
				case 5:
					System.out.println("Stack operations Stopped...");
					System.exit(0);
				default:
					System.out.println("Invalid Choice....");
				}//end of switch
			}//end of while
		}//end of try with resource
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}