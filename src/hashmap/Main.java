package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
	

	
	public static void main(String[] args) {
		
		
		
		// Declare HashMap
		
		// 		Key		 Value							Key 	Value
		
		// Key String -> "Key"  Value String -> "Value"
		
		// Key Integer -> Key   Value Integer -> Value
		
		// Dont be duplicate key
		
		
		HashMap<Integer, String> names = new HashMap<Integer, String>();
		
		
		// Insert into Hashmap

			names.put(1, "Mg Mg"); // 0  index
			
			names.put(2, "Soe Soe"); // 1 
			
			names.put(3, "Lin Lin"); // 2 
			
			names.put(4, "Aung Aung"); // 3
			
			names.put(5, "Phyo Khant"); // 4 
			
			names.put(6, "Min Min"); // 5 
			
			names.put(7, "Tun Tun"); // 6  
			
			
			// System.out.println(names.size());
			
			//  When use for each loop use Map.Entry and Determine your collection array key and value data type
			
			// output with key and value
			
			for (Map.Entry<Integer, String> name : names.entrySet()) { 
				
				System.out.println("Key is "+ name.getKey() + " and value is "+ name.getValue());
				
			}
			
			System.out.println("===================Value output with KeySet=====================");
			
			// output only value
			
			for (int key : names.keySet()) {
				System.out.println(names.get(key));
				
			}
			
			System.out.println("=============Removeing the Array====================");
			
//			names.remove(7); // Remove Moe Moe only key
////			
//			names.remove(7, "Phyo Khant"); // Remove with Value and key
			
			
			for (Map.Entry<Integer, String> name : names.entrySet()) { 
				
				System.out.println("Key is "+ name.getKey() + " and value is "+ name.getValue());
				
			}
			
			
			System.out.println("==============Contains Checking The Array=============");
			
			String isContain = names.containsKey(5) ? "Yes" : "No"; // Contains only Key
			
			String isContainValue = names.containsValue("Phyo Min") ? "Yes" :  "No"; // Check with Value
			
			
			System.out.println(isContain);
			
			
			System.out.println(isContainValue);
			
			// Checking with Key and value
			
			System.out.println(names.get(5).equals("Phyo Khant"));
			
			
			System.out.println(names.get(1).equals("Mg Mg"));
			
			System.out.println("============Replance Data in Array==========");
			
			// Replace -> Key and value 
			
			names.replace(2, "Paing Khant");
			
			for (int key : names.keySet()) {
				System.out.println(names.get(key));
				
			}
			
			
			System.out.println("======Output Only One========");
			
//			
//			System.out.println(names.get(1));
			
			System.out.println(names.getOrDefault(11, "Phyo Khant"));
			
			
			for (Map.Entry<Integer, String> name : names.entrySet()) { 
				
				System.out.println("Key is "+ name.getKey() + " and value is "+ name.getValue());
				
			}
			
				
			
			
		
		
		
	}

}
