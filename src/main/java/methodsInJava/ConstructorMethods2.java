package methodsInJava;

public class ConstructorMethods2 {

	public static void main(String[] args) {
		ConstructorMethods obj = new ConstructorMethods(1234);

		obj.printEmpDetails("Greeshma");
		obj.printEmpAddress("Mumbai");
		obj.printEmpVisaDetails("TRS65675S");

		obj = new ConstructorMethods(1235);

		obj.printEmpDetails("Harpreet");
		obj.printEmpAddress("Punjab");
		obj.printEmpVisaDetails("T4747HGHJ");

	}

}
