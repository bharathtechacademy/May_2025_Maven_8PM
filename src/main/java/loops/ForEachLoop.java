package loops;

import java.util.HashSet;
import java.util.Set;

public class ForEachLoop {
	
//	for (DataType variable : PreDefinedList) {
//		
//	}

	public static void main(String[] args) {
		
		String[] newEmpNames = new  String[4] ;
		newEmpNames[0]="Teja";
		newEmpNames[1]="Afreen";
		newEmpNames[2]="Arayan";
		newEmpNames[3]="Bharath";
		
		for (int i=0; i<newEmpNames.length ;i++) {
			System.out.println(newEmpNames[i]);
		}
		
		System.out.println("**********For-Each Loop***********");
		
		for(String value : newEmpNames) {
			System.out.println(value);
		}
		
		System.out.println("**********For-Each Loop***********");
		
		//Example 2:
		
		Set<String> empNamesHashSet = new HashSet<String>();	
		empNamesHashSet.add("Teja");
		empNamesHashSet.add("Afreen");
		empNamesHashSet.add("Arayan");
		empNamesHashSet.add("Bharath");
		
		for(String value : empNamesHashSet) {
			System.out.println(value);
		}

	}

}
