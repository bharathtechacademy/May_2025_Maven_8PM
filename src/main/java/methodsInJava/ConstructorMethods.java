package methodsInJava;

public class ConstructorMethods {

	// constructor method , it will create by default by java ,every time when new
	// class is created with same name as class name method won't have any return
	// type

	// default constructor
	// parameterized constructor

	int empId;

	//parameterized constructor
	ConstructorMethods(int id) {
		empId =id;
	}
	
	//default constructor
	ConstructorMethods() {
	}


	
	void printEmpDetails(String name) {
		System.out.println(empId);
		System.out.println(name);
	}

	void printEmpAddress(String Address) {
		System.out.println(empId);
		System.out.println(Address);
	}

	void printEmpVisaDetails(String visaNumber) {
		System.out.println(empId);
		System.out.println(visaNumber);
	}

}
