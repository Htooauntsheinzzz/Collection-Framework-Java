package hashtable;

import java.util.Hashtable;
import java.util.Map;

public class Main {
	
	
	public static void main(String[] args) {
		
		// Declare
		
		// Hashtable<K, V> collectionName = new Hashtable<K, V>();
		
		Hashtable<Integer,String> names = new Hashtable<Integer, String>();
		
		// Insert Data
		
		// Insertion order -> Yes (Key Only)
		
		names.put(1, "Mg Mg");
		
		names.put(2, "Soe Soe");
		
		names.put(3, "Lin Lin");
		
		names.put(4, "Khin Khin");
		
		names.put(5,"Min Min");
		
		names.put (6, "Phyo Khant");
		
		
		System.out.println(names.size());
		
		
		System.out.println(names.values());
		
		
		Hashtable<Integer, String> clone = new Hashtable<Integer, String>(); 
		
		clone.putAll(names);
		
		
		for (Map.Entry<Integer, String> map : clone.entrySet()) {
			
			System.out.println("Clone Key is "+ map.getKey()  +" and value is "+ map.getValue());
		}
		
		
		System.out.println("-----New Looping-----");
		
		
		
		clone.replace(2, "Paing Khant");
		
		
		clone.remove(4);
		
		for (int key : clone.keySet()) {
			
			System.out.println("Key is "+key + "and value is "+clone.get(key));
		}
		
		
		System.out.println(clone.isEmpty());
		
		
		
		
		
		
		
		
	}

}
