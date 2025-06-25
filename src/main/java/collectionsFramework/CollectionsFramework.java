package collectionsFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsFramework {
	
	// Array ==> Data type can store multiple values with similar data type together at one place
	
	// Challenges of Arrays
	
	// 1. Arrays are fixed in size
	// 2. Memory will be allocated at the beginning of creating array / static memory allocation
	// 3. Array allows similar data types only
	// 4. Modifications also not allowed
	
	//	String[] newEmpNames = new  String[4] ;
	//	newEmpNames[0]="Teja";
	//	newEmpNames[1]="Afreen";
	//	newEmpNames[2]="Arayan";
	//	newEmpNames[3]="Bharath";
		
	
	// Collections Framework
	
	// List ==> ArrayList, LinkedList
	
	// 1. List can store multiple values with similar data type together at one place by allocating memory dynamically
	// 2. List can follow dynamic memory allocation
	// 3. List allows modifications
	// 4. List allows duplicate values
	
	// Set ==> HashSet, LinkedHashSet, TreeSet
	
	// 1. Set can store multiple values with similar data type together at one place by allocating memory dynamically
	// 2. Set can follow dynamic memory allocation
	// 3. Set allows modifications
	// 4. Set won't allow duplicate values
	
	// Map ==> HashMap, LinkedHashMap, TreeMap & HashTable
	
	// 1. Map can store multiple values with different data type together in the form of key and value at one place by allocating memory dynamically
	// 2. Map can follow dynamic memory allocation
	// 3. Map allows modifications
	// 4. Map won't allow duplicate keys but values can be duplicate
	
	public static void main(String[] args) {
		
		
			String[] newEmpNames = new  String[4] ;
			newEmpNames[0]="Teja";
			newEmpNames[1]="Afreen";
			newEmpNames[2]="Arayan";
			newEmpNames[3]="Bharath";
		
	/*************ArrayList*************/
		
		System.out.println("*************ArrayList*************");
		
	//Syntax to Initialize/create: 	List<DataType> variable = new ArrayList<DataType>();
	//Syntax to add data: variable.add(value);
	//Syntax to remove the data:variable.remove(value);	
	//Syntax to get the data: variable.get(index);	
	//Syntax to get the total value : variable.size();	
		
	//Order of Storing Values: Insertion Order
	//Null Values : Allowed
				
		List<String> empNamesArrayList = new ArrayList<String>();	
		empNamesArrayList.add("Teja");
		empNamesArrayList.add("Afreen");
		empNamesArrayList.add("Arayan");
		empNamesArrayList.add("Bharath");
		empNamesArrayList.add("Teja");
		empNamesArrayList.add(null);
		empNamesArrayList.add(3,"Sushmitha");
		empNamesArrayList.remove("Bharath");
		System.out.println("ArrayList size is :"+empNamesArrayList.size());
		System.out.println(empNamesArrayList);

		
	/*************LinkedList*************/
		
		System.out.println("*************LinkedList*************");
		
	//Syntax to Initialize/create: 	List<DataType> variable = new LinkedList<DataType>();
	//Syntax to add data: variable.add(value);
	//Syntax to remove the data:variable.remove(value);	
	//Syntax to get the data: variable.get(index);	
	//Syntax to get the total value : variable.size();	
		
	//Order of Storing Values: Insertion Order
	//Null Values : Allowed
				
		List<String> empNamesLinkedList = new LinkedList<String>();	
		empNamesLinkedList.add("Teja");
		empNamesLinkedList.add("Afreen");
		empNamesLinkedList.add("Arayan");
		empNamesLinkedList.add("Bharath");
		empNamesLinkedList.add("Teja");
		empNamesLinkedList.add(null);
		empNamesLinkedList.add(3,"Sushmitha");
		empNamesLinkedList.remove("Bharath");
		System.out.println("LinkedList size is :"+empNamesLinkedList.size());
		System.out.println(empNamesLinkedList);
		
		
	/*************HashSet*************/
		
		System.out.println("*************HashSet*************");
		
		//Syntax to Initialize/create: 	Set<DataType> variable = new HashSet<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to remove the data:variable.remove(value);	
		//Syntax to get the total value : variable.size();	
			
		//Order of Storing Values: Random Order
		//Null Values : Allowed
				
		Set<String> empNamesHashSet = new HashSet<String>();	
		empNamesHashSet.add("Teja");
		empNamesHashSet.add("Afreen");
		empNamesHashSet.add("Arayan");
		empNamesHashSet.add("Bharath");
		empNamesHashSet.add("Teja");
		empNamesHashSet.add(null);
		empNamesHashSet.remove("Bharath");
		System.out.println("HashSet size is :"+empNamesHashSet.size());
		System.out.println(empNamesHashSet);
	
		/************* LinkedHashSet *************/

		System.out.println("*************LinkedHashSet*************");

		//Syntax to Initialize/create: 	Set<DataType> variable = new LinkedHashSet<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to remove the data:variable.remove(value);	
		//Syntax to get the total value : variable.size();	

		//Order of Storing Values: Insertion Order
		//Null Values : Allowed

		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		empNamesLinkedHashSet.add("Teja");
		empNamesLinkedHashSet.add("Afreen");
		empNamesLinkedHashSet.add("Arayan");
		empNamesLinkedHashSet.add("Bharath");
		empNamesLinkedHashSet.add("Teja");
		empNamesLinkedHashSet.add(null);
		empNamesLinkedHashSet.remove("Bharath");
		System.out.println("LinkedHashSet size is :" + empNamesLinkedHashSet.size());
		System.out.println(empNamesLinkedHashSet);
		
		/************* TreeSet *************/

		System.out.println("*************TreeSet*************");

		//Syntax to Initialize/create: 	Set<DataType> variable = new TreeSet<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to remove the data:variable.remove(value);	
		//Syntax to get the total value : variable.size();	

		//Order of Storing Values: Ascending/ Alphabetical Order
		//Null Values : Not Allowed

		Set<String> empNamesTreeSet = new TreeSet<String>();
		empNamesTreeSet.add("Teja");
		empNamesTreeSet.add("Afreen");
		empNamesTreeSet.add("Arayan");
		empNamesTreeSet.add("Bharath");
		empNamesTreeSet.add("Teja");
//		empNamesTreeSet.add(null);
		empNamesTreeSet.remove("Bharath");
		System.out.println("TreeSet size is :" + empNamesTreeSet.size());
		System.out.println(empNamesTreeSet);
		
		
		/************* Map *************/
		
		// Wrapper Classes

		System.out.println("*************HashMap*************");

		//Syntax to Initialize/create: 	Map<Key,Value> variable = new HashMap<Key,Value>();
		//Syntax to add data: variable.put(key,value);
		//Syntax to remove the data:variable.remove(key);	
		//Syntax to get the total value : variable.size();	
		//Syntax to get the  value : variable.get(key);

		//Order of Storing Values: Random Order
		//Null Values :  Allowed
		//Null Keys :  Allowed

		Map<Integer,String> empNamesHashMap = new HashMap<Integer,String>();
		empNamesHashMap.put(1,"Teja");
		empNamesHashMap.put(2,"Afreen");
		empNamesHashMap.put(3,"Arayan");
		empNamesHashMap.put(4,"Bharath");
		empNamesHashMap.put(4,"Basava");
		empNamesHashMap.put(5,"Teja");
		empNamesHashMap.put(6,null);
		empNamesHashMap.put(null,"Aakash");
		empNamesHashMap.remove(2);
		System.out.println("HashMap size is :" + empNamesHashMap.size());
		System.out.println(empNamesHashMap);
		
		System.out.println("*************LinkedHashMap*************");

		//Syntax to Initialize/create: 	Map<Key,Value> variable = new LinkedHashMap<Key,Value>();
		//Syntax to add data: variable.put(key,value);
		//Syntax to remove the data:variable.remove(key);	
		//Syntax to get the total value : variable.size();	
		//Syntax to get the  value : variable.get(key);

		//Order of Storing Values: Insertion Order
		//Null Values :  Allowed
		//Null Keys :  Allowed

		Map<Integer,String> empNamesLinkedHashMap = new LinkedHashMap<Integer,String>();
		empNamesLinkedHashMap.put(1,"Teja");
		empNamesLinkedHashMap.put(2,"Afreen");
		empNamesLinkedHashMap.put(3,"Arayan");
		empNamesLinkedHashMap.put(4,"Bharath");
		empNamesLinkedHashMap.put(4,"Basava");
		empNamesLinkedHashMap.put(5,"Teja");
		empNamesLinkedHashMap.put(6,null);
		empNamesLinkedHashMap.put(null,"Aakash");
		empNamesLinkedHashMap.remove(2);
		System.out.println("LinkedHashMap size is :" + empNamesLinkedHashMap.size());
		System.out.println(empNamesLinkedHashMap);
		
		System.out.println("*************TreeMap*************");

		//Syntax to Initialize/create: 	Map<Key,Value> variable = new TreeMap<Key,Value>();
		//Syntax to add data: variable.put(key,value);
		//Syntax to remove the data:variable.remove(key);	
		//Syntax to get the total value : variable.size();	
		//Syntax to get the  value : variable.get(key);

		//Order of Storing Values: Ascending Order
		//Null Values :  Allowed
		//Null Keys :  Not Allowed

		Map<Integer,String> empNamesTreeMap = new TreeMap<Integer,String>();
		empNamesTreeMap.put(1,"Teja");
		empNamesTreeMap.put(2,"Afreen");
		empNamesTreeMap.put(3,"Arayan");
		empNamesTreeMap.put(4,"Bharath");
		empNamesTreeMap.put(4,"Basava");
		empNamesTreeMap.put(5,"Teja");
		empNamesTreeMap.put(6,null);
//		empNamesTreeMap.put(null,"Aakash");
		empNamesTreeMap.remove(2);
		System.out.println("TreeMap size is :" + empNamesTreeMap.size());
		System.out.println(empNamesTreeMap);
		
		//*************Hashtable*************"
		
		System.out.println("*************Hashtable*************");

		//Syntax to Initialize/create: 	Map<Key,Value> variable = new Hashtable<Key,Value>();
		//Syntax to add data: variable.put(key,value);
		//Syntax to remove the data:variable.remove(key);	
		//Syntax to get the total value : variable.size();	
		//Syntax to get the  value : variable.get(key);

		//Order of Storing Values: Ascending Order
		//Null Values : Not Allowed
		//Null Keys :  Not Allowed

		Map<Integer,String> empNamesHashtable = new Hashtable<Integer,String>();
		empNamesHashtable.put(1,"Teja");
		empNamesHashtable.put(2,"Afreen");
		empNamesHashtable.put(3,"Arayan");
		empNamesHashtable.put(4,"Bharath");
		empNamesHashtable.put(4,"Basava");
		empNamesHashtable.put(5,"Teja");
//		empNamesHashtable.put(6,null);
//		empNamesHashtable.put(null,"Aakash");
		empNamesHashtable.remove(2);
		System.out.println("Hashtable size is :" + empNamesHashtable.size());
		System.out.println(empNamesHashtable);
		
		
}
	
	
	
	

}
