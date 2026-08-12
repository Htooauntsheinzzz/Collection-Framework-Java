package enumset;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

public class Main {
	
	public static void main(String[] args) {
		
		// Delcare
		
		// String or Integer -> Days
		
		
		Set<Days> weekend = EnumSet.of(Days.SATURDAYS,Days.SUNDAYS) ;
		
		
		Set<Days> weekdays = EnumSet.of(Days.MONDAYS,Days.TUESDAYS,Days.WEDNESDAYS,Days.THURSDAYS,Days.FIRDAYS);
		
	
		Spliterator<Days> spliterator  = weekend.spliterator();
		
		spliterator.forEachRemaining((day) -> System.out.println(day));
		
		
		Iterator iterator = weekdays.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
	}

}
