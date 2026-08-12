package treemap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		
	    // Declare
		
		// TreeMap<K, V>  collection name = new TreeMap<K, V>();
		
		TreeMap<String,String> tmap = new TreeMap<String, String>();
		
		// Insert -> put
		
		// Insertion Order maintain ->  Yes (key Only)
		
		tmap.put("Zero", "Mg Mg");
		
		tmap.put("One", "Aung Aung");
		
		tmap.put("Two", "Soe Soe");
		
		tmap.put("Three", "Lin Lin");
		
		tmap.put("Four", "Phyo Khant");
		
		tmap.put("Five","Min Min");
		
		
		System.out.println(tmap.values());
		
		// replace , put , clear , clone ,containsKey , putAll , size
		
		
		tmap.replace("Two", "Paing Khant");
		

		for(Map.Entry<String, String> map : tmap.entrySet()) {
			
				System.out.println("Key is "+map.getKey() + " and value is "+map.getValue());
		}
		
		
		TreeMap<String, String> clone = (TreeMap<String,String>) tmap.clone();
		
		System.out.println("------After Cloning Result-----");
		
		
		 clone.clear();
		
		boolean contains  = clone.containsKey("Two");
		
		System.out.println(contains);
		
	
		
		for(Map.Entry<String, String> map : clone.entrySet()) {
			
			System.out.println("Key is "+map.getKey() + " and value is "+map.getValue());
		}
		
		
		System.out.println("------After Put All Result------");
		
		TreeMap<String, String>  putResult = new TreeMap<String, String>();
		
		putResult.putAll(tmap);
		
		for(Map.Entry<String, String> map : putResult.entrySet()) {
			
			System.out.println("Key is "+map.getKey() + " and value is "+map.getValue());
		}
		
		System.out.println(putResult.size());
		
		
		
		
		
		
		
		
	}

}
