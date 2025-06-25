package classesAndObjects;

public class Class3 extends Class1{ //child extends parent

	public static void main(String[] args) {
		
		Class1 obj = new Class3();
		System.out.println(obj.name);
		System.out.println(obj.empId);
		System.out.println(obj.visaStatus);
	}

}
