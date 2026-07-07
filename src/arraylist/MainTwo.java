package arraylist;

import java.util.ArrayList;
import java.util.Arrays;


/*
 * contain()
 * clone()
 */
public class MainTwo {
	
	public static void main(String[] args) {
		
	ArrayList<String> names = new ArrayList<String>(); 
		
		names.add("Mg Mg");  // 0 
		
		names.add("Tun Tun"); // 1
		
		names.add(2, "Phyo Khant Kyaw"); // 2
		
		names.add("Su Su");//3
		
		names.add("Kyaw Kyaw"); //4
		
 		names.add("Moe Moe");//5 
 		
 		names.add("Su Su");// duplicate value accept 6
 		
 		
 		String[] ary = new String[names.size()]; // initialize
 		ary = names.toArray(ary); // insert data
 		
 		
 	
 		System.out.println(Arrays.toString(ary));
 		
	// using Object
 		Object[] o = names.toArray();
 		System.out.println(Arrays.toString(o));
 		
 		
 		// Clone
 		
 		ArrayList<String> list2 = (ArrayList)names.clone(); 
 		
//		new MainTwo().output(list2);
 		
 		
 		ArrayList<String> students = new ArrayList<String>();
 		
 		students.add("Su Su");
 		students.add("Paing Khant Kyaw");
 		
 		
 		System.out.println(names.contains("Tun Tun"));
 		
 		names.removeAll(students);  // remove student like names array are remove from names arrays
 		
 		
 		students.add("Su Su");
 		students.add("Kyaw Kyaw");
 		
 		names.retainAll(students); // take data from names like students names
 		
 		
 		students.add("Bo Bo");
 
 		
 		students.addAll(1,names); // index 1 from names -> students array input
 		
 		new MainTwo().output(students);
 		
 		
 		
		
	}
	
	public void output(ArrayList<String> list) {
		
		
		for(String name : list) {
			System.out.println(name);
		}
	}

}
