package stringOperations;

public class TypeCasting {

	public static void main(String[] args) {
		// Auto Casting ==> smaller data type to bigger one. (widening conversion.)
		byte marks = 98;
		short marks1 =marks;
		int marks2 = marks1;
		System.out.println(marks2);
		
		//Narrow Casting ==>
		int value = 289473098;
		byte value1 = (byte)value;		
		System.out.println(value1);
		
		//Upcasting & downcasting
		

	}

}
