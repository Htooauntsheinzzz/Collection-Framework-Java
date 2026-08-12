package enummap;

import java.util.EnumMap;
import java.util.Map;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		
																		
		// EnumMap<Enum<K>, V> collectionName = new EnumMap<Enum<K>, V>(Enum.class)
		
		
		
		EnumMap<DaysOfWorkers, String> dutyEmp = new EnumMap<DaysOfWorkers, String>(DaysOfWorkers.class);
		
		// Insert 
		
		dutyEmp.put(DaysOfWorkers.MONDAYS, "Mg Mg");
		
		dutyEmp.put(DaysOfWorkers.TUNESDAYS, "Soe Soe");
		
		dutyEmp.put(DaysOfWorkers.WEDNESDAYS, "Ko Ko");
		
		dutyEmp.put(DaysOfWorkers.THURSDAYS, "Min Min");
		
		dutyEmp.put(DaysOfWorkers.FRIDAYS, "Phyo Khant");
		
		
		
		
		for(Map.Entry<DaysOfWorkers, String> map : dutyEmp.entrySet()) {
			
			
			System.out.println(map.getKey() + " on Duty Employee is "+ map.getValue());
		}
		
	}

}
