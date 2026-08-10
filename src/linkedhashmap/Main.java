package linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		// Declare

	
		LinkedHashMap<Integer, String> names = new LinkedHashMap<Integer, String>();
		
		// Insert 
		
		names.put(1, "Mg Mg"); // 0  index
		
		names.put(2, "Soe Soe"); // 1 
		
		names.put(3, "Lin Lin"); // 2 
		
		names.put(4, "Aung Aung"); // 3
		
		names.put(5, "Phyo Khant"); // 4 
		
		names.put(6, "Min Min"); // 5 
		
		names.put(7, "Tun Tun"); // 6  
		
		System.out.println(names.size());
		
		
		for(Map.Entry<Integer, String> map : names.entrySet()) {
			System.out.println("Key is "+map.getKey() + " and value is "+map.getValue());
		}
		
		System.out.println("================Cloning Into new Array===========");
		
		
		LinkedHashMap<Integer, String> cloneNames =(LinkedHashMap<Integer, String>) names.clone();
		
		
		
		for(Map.Entry<Integer, String> map : cloneNames.entrySet()) {
			System.out.println("Key is "+map.getKey() + " and value is "+map.getValue());
		}
		
		
		System.out.println("=======Checking the array=======");
		
		cloneNames.clear();
		
		boolean isEmpty = cloneNames.isEmpty();
		
		System.out.println(isEmpty);
		
		String contains = cloneNames.containsValue("Phyo Khant") ? "Yes" : "No";
		
		System.out.println(contains);
		
		
		
		
		
	}

}
