package linkedlist;

import java.util.LinkedList;

public class Main {
	
	public static void main(String[] args) {
		
		
		// Creating LinkedList
		// LinkedList<String> numbers = new LinkedList<String>();
		
		LinkedList<String> names = new LinkedList<>(); // Create LinkedList
		
		// creating index
		
		names.add("Mg Mg"); // 0
		
		names.add("Soe Soe");// 1
		
		names.add("Aung Aung");//3
		
		names.add("Min Min");//4
		
		names.add("Thu Thu");// 5
		
		names.add("Bo Bo");// 6
		
		
//		System.out.println(names.size()); // LinkedList Length 
		
		names.add(2,"Mu Mu");// inserting Mu Mu to Aung Aung // 2 
		
		System.out.println(names.size());
		
		System.out.println(names.get(2));
		
		System.out.println(names.get(3));
		
		
		
	}

}
