package deque_arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Spliterator;


/***
 * 
 *  Insertion Order maintain -> Yes
 *  New Object with ArrayDeque
 */
public class Main {
	
	
	public static void main(String[] args) {
		
		// Declare					// **** 
		Deque<String> names = new ArrayDeque<String>();
		
		names.add("Mg Mg"); // poll 
		
		names.add("Soe Soe");//0
		
		names.add("Min Min");
		
		names.add("Lin Lin");
		
		names.add("Zay Zay");
		
		names.offer("New One");
		
		names.offer("Phyo Khant");
		
		
		// Poll 
		
		//String pollName = names.poll();
		
		
		String peekName = names.peek();
		
		
		String removeName = names.remove();
		
		
//		for(String name : names) {
//			System.out.println(name);
//		}
		
		
		Spliterator<String> spliterator = names.spliterator();
		
		spliterator.forEachRemaining((name) -> System.out.println(name));
		
		System.out.println(names.size());
		
		System.out.println("************************");
		
		//System.out.println(pollName);
		
		
		System.out.println(peekName);
		
		
		System.out.println(removeName);
		
		
		
		
		
	}

}
