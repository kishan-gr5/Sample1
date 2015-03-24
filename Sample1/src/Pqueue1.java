import java.util.*;
public class Pqueue1 {
	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("abc");
		queue.add("bcd");
		queue.add("def");
		
		System.out.println(queue.element());
		System.out.println(queue.peek());
		System.out.println("---------------");
		Iterator<String> i = queue.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		queue.remove();
		queue.poll();
		System.out.println("after removing...");
		for(String s:queue)
		{
			System.out.println(s);
		}
	}

}
