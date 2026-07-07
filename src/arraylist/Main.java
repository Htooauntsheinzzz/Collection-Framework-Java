package arraylist;

import java.util.ArrayList;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		// Creating ArrayList
		// 		Datatype  arrayListName
		//ArrayList<String> students = new ArrayList<>();
		
		ArrayList<String> names = new ArrayList<String>(); 
		
		// Insert Data
		
		names.add("Mg Mg"); // 0
		names.add("Tun Tun"); // 1
		names.add("Su Su");// 3
		names.add("Kyaw Kyaw"); // 4
 		names.add("Moe Moe");// 5
 		
 		System.out.println(names.size());
 
 		
 		// Insert Details Index
 		names.add(2, "Phyo Khant Kyaw"); // 2
 		
 		System.out.println(names.size()); // arraylist length = size
 		
 		System.out.println(names.get(2));
 		
 		System.out.println("Output From the Names ArrayList");

 		System.out.println(names.get(0));
 		
 		System.out.println(names.get(1));
 		
 		System.out.println(names.get(2));
 		
 		System.out.println(names.get(3));
 		
 		System.out.println(names.get(4));
 		
 		System.out.println(names.get(5));
 		
 		
 	
 		
 		
 		
 		
 		
 		
 		
 		
	

		
	}

}
