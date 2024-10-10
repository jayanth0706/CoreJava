package maccess;
import java.util.*;
public class DemoQueue 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=11;i<=15;i++) {
			pq.add(new Integer(i));
		}
		for(int i=16;i<=20;i++) {
			pq.offer(new Integer(i));
		}
		System.out.println("Elements in pq : "+pq.toString());
		System.out.println("element() : "+pq.element());
		System.out.println("peek() : "+pq.peek());
		System.out.println("======remove()=====");
		pq.remove();
		System.out.println("Elements in pq : "+pq.toString());
		System.out.println("======poll()======");
		pq.poll();
		System.out.println("Elements in pq : "+pq.toString());
	}
}