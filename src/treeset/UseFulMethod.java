package treeset;

import java.util.Spliterator;
import java.util.TreeSet;

public class UseFulMethod {
	
	
	public static void main(String[] args) {
		
		
		TreeSet<String> names = new  TreeSet<String>();
		
		names.add("Mg Mg");// index 0
		
		names.add("Soe Soe"); // 1
		
		names.add("Phyo Phyo"); // 2
		
		names.add("Lin Lin"); // 3
		
		names.add("Tun Tun"); //4 
		
		names.add("Khin Khin");// 5 
		
		TreeSet<String> tset = new  TreeSet<String>();
		
		tset.add("Superman");
		
		tset.addAll(names);
		
		Spliterator<String> spliterator = tset.spliterator();
		
		spliterator.forEachRemaining( (n) -> System.out.println(n));
		
		
		System.out.println("******************************************");
		
		
//		System.out.println(tset.ceiling("Tun Tun"));
//		
//		System.out.println(tset.floor("Tun Tun"));
		
		System.out.println(tset.headSet("Soe Soe")); // Array Of element shae pine
	

		// Khin Khin , Lin Lin,Mg Mg,Phyo Phyo,Soe Soe,Superman   <------- Tun Tun
		
		
		System.out.println(tset.higher("Lin Lin")); // Array of Index + 1 ( Lin Lin (1) + 1 = 2 => Mg Mg
		
		System.out.println(tset.lower("Lin Lin")); // Array of Index - 1 
		
		
		System.out.println(tset.subSet("Lin Lin", "Superman")); // Array of Index From To
		
		
		System.out.println(tset.tailSet("Phyo Phyo")); // Array Of Index -> Later INDEXS

	}

}
