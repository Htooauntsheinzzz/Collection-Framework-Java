package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

// clear()
// isEmpty()
// remove()
// addAll()
 
public class UseFullMethod {

	
	public static void main(String[] args) {
		
		
	ArrayList<String> names = new ArrayList<String>(); 
		
	
		names.add("Mg Mg");  // 0 
		
		names.add("Tun Tun"); // 1
		
		names.add(2, "Phyo Khant Kyaw"); // 2
		
		names.add("Su Su");//3
		
		names.add("Kyaw Kyaw"); //4
		
 		names.add("Moe Moe");//5 
 		
 		names.add("Su Su");// duplicate value accept 6
 		
 		
 		System.out.println("-------BEFORE------------");
 		
 		new UseFullMethod().output(names);
 		
 	
 		// names.clear(); //  index data remove
 		System.out.println(names.isEmpty()); // Boolean 

		String rem = names.remove(3); // removing with index number detail 
		 
		System.out.println(rem);
 		
 		
		ArrayList<String> students = new ArrayList<String>(names); // names arry data insert to students data
		
		System.out.println(students.size());
		
		
		
 		
 		ArrayList<String> drivers = new ArrayList<String>();
 		
 		drivers.add("U Ba");// 7
 		drivers.add("U Mya"); // 8
 		
 		names.addAll(drivers); // 	DRIVERS ADD TO NAMES ARRAYS 
 		
 		System.out.println("--------AFTER ADDING----------");
 		
 		new UseFullMethod().output(names);
 	
 		
	}
	
	
	
	public void output(ArrayList<String> list) {
		
		
		for(String name : list) {
			System.out.println(name);
		}
	}
}
