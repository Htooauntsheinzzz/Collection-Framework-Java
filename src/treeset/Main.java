package treeset;

import java.util.Spliterator;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		
		// Initial

		//TreeSet<Integer> numerbs = new TreeSet<>();
		
		TreeSet<String> names = new  TreeSet<String>();
		
		// Insert 
		
		// Insertion order maintain no
		
		// Insert In order
		
		names.add("Mg Mg");// index 0
		
		names.add("Soe Soe"); // 1
		
		names.add("Phyo Phyo"); // 2
		
		names.add("Lin Lin"); // 3
		
		names.add("Tun Tun"); //4 
		
		names.add("Khin Khin");// 5 
		
//		names.add("Tun Tun"); No Duplicate
		
		
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		
		
		numbers.add(22); // 0
		numbers.add(19); // 1
		numbers.add(40); // 2
		numbers.add(30);//3
		numbers.add(25); // 4
		
		
		
//		Spliterator<String> spliterator = names.spliterator();
//		
//		spliterator.forEachRemaining( (n) -> System.out.println(n));
		
		
		// Sorted Order Insert
		
		Spliterator<Integer> spliterator2 = numbers.spliterator();
		
		spliterator2.forEachRemaining( (number) -> System.out.println(number));
		
		
		
		TreeSet<String> tset = new TreeSet<String>();
		
		tset.add("Superman");  // K ---> S
		
		
		tset.addAll(names);
		
		
//		System.out.println(tset.pollFirst());
//		
//		System.out.println("After poll first");
		
		
//		Spliterator<String> tsetSpliterator = tset.spliterator();
//		
//		tsetSpliterator.forEachRemaining( (t) -> System.out.println(t));
//		
//		System.out.println(tset.pollLast()); // Tun Tun (T is last character) 
		
		
//		tset.remove("Lin Lin");
		
		
		Spliterator<String> tsetSpliterator = tset.spliterator();
		
		tsetSpliterator.forEachRemaining( (t) -> System.out.println(t));
		
		
		
		
		
	}

}
