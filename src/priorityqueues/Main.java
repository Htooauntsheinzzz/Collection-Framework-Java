package priorityqueues;

import java.util.PriorityQueue;
import java.util.Spliterator;

public class Main {
	
	
	public static void main(String[] args) {
		
		// Declare 
		
		PriorityQueue<String> names = new PriorityQueue<String>();
		
		names.add("Mg Mg"); // 0 
		
		names.add("Su Su"); // 1
		
		names.add("Khin Khin"); // 2
		
		names.add("Kyaw Kyaw"); // 3
		
		names.add("Mu Mu"); // 4 
		
		names.add("hey now");
		
	
		
		
		//System.out.println(names.size());
		
		
		names.remove("Mu Mu");
		
		String pollName = names.poll();
		
		String peekName = names.peek();
		
		
		Spliterator<String> spliterator = names.spliterator();
		
		spliterator.forEachRemaining( (name) -> System.out.println(name));
		
		System.out.println("*****************************");
		
		System.out.println(pollName);
		
		System.out.println(peekName);
		
		
		
		
		
		
		
		
		
	}

}
