package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListItratorForArrayLists {
	
	public static void main(String[] args) {
		
		
	ArrayList<String> names = new ArrayList<String>(); 
		
		names.add("Mg Mg");  // 0 
		
		names.add("Tun Tun"); // 1
		
		names.add(2, "Phyo Khant Kyaw"); // 2
		
		names.add("Su Su");//3
		
		names.add("Kyaw Kyaw"); //4
		
 		names.add("Moe Moe");//5 
 		
 		names.add("Su Su");// duplicate value accept 6
 		
 		// Iterate ->names -> reverse arrays
 	
 		ListIterator<String> iterators = names.listIterator(names.size()); // names -> put -> iterators
 		
 		
 		
 		while(iterators.hasPrevious()) {
 			String name = iterators.previous();
 			System.out.println(name);
 		}
 		
 		// Normal 
 		Iterator iterator = names.iterator(); // Obj
 		
 		while(iterator.hasNext()) {
 			String name = (String)iterator.next();
 			System.out.println(name);
 		}
 		
 		
	}

}
