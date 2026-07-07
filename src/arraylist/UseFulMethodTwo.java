package arraylist;

import java.util.ArrayList;


/* 
 *   lastIndexOf()
 *   indexOf()
 * 
 *  
 */
public class UseFulMethodTwo {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>(); 
		
		names.add("Mg Mg");  // 0 
		
		names.add("Tun Tun"); // 1
		
		names.add(2, "Phyo Khant Kyaw"); // 2
		
		names.add("Su Su");//3
		
		names.add("Kyaw Kyaw"); //4
		
 		names.add("Moe Moe");//5 
 		
 		names.add("Su Su");// duplicate value accept 6
 		
 		
 		new UseFulMethodTwo().output(names);
 		
 		
 		System.out.println(names.lastIndexOf("Su Su")); // Index Number when data have
 		
 		
 		System.out.println(names.indexOf("Su Su")); // Index when search first -> show
 		
 		
 		
 		
 		
	}
	
	
	
	
	
	
	public void output(ArrayList<String> list) {
		
		
		for(String name : list) {
			System.out.println(name);
		}
	}

}
