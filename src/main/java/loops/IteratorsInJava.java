package loops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorsInJava {

	public static void main(String[] args) {
		
		List<String> empNamesArrayList = new ArrayList<String>();	
		empNamesArrayList.add("Teja");
		empNamesArrayList.add("Afreen");
		empNamesArrayList.add("Arayan");
		empNamesArrayList.add("Bharath");
		
		Iterator<String> iterator1 = empNamesArrayList.iterator();
		while(iterator1.hasNext()) {
			String value = iterator1.next();
			System.out.println(value);
		}
				
		Set<String> empNamesHashSet = new HashSet<String>();	
		empNamesHashSet.add("Teja");
		empNamesHashSet.add("Afreen");
		empNamesHashSet.add("Arayan");
		empNamesHashSet.add("Bharath");
		
		Iterator<String> iterator2 = empNamesHashSet.iterator();
		while(iterator2.hasNext()) {
			String value = iterator2.next();
			System.out.println(value);
		}

	}

}
