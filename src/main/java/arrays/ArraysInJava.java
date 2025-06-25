package arrays;

public class ArraysInJava {

	public static void main(String[] args) {

		// Arrays ==> Data type can store multiple values with similar data type  together at one place

		// When we know all the values to be stored in Array before itself
		// Syntax to initialize array : DataType [] Variable = {value1, value2, value3};
		
		String[] empNames = { "Teja", "Afreen", "Arayan", "Bharath" };
		System.out.println(empNames [1]);
		
		int[] empIds = {1234, 1235, 1236, 1237};
		
		
		// When we don't know all the values to be stored in Array initially
		// Syntax to initialize array : DataType [] Variable = new DataType [Length/Size] ;
		// Syntax to store values array :Variable[Index] = value;
		
		String[] newEmpNames = new  String[4] ;
		newEmpNames[0]="Teja";
		newEmpNames[1]="Afreen";
		newEmpNames[2]="Arayan";
		newEmpNames[3]="Bharath";
//		newEmpNames[4]="Apurva";
		
		System.out.println(newEmpNames[3]);
		System.out.println(newEmpNames.length);
		
		

	}

}
