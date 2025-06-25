package polymorphism;

public class MethodOverloading {

	// MethodOverloading ==> having multiple methods with same name but different
	// arguments in same class

	public int sumOfNumbers(int a, int b) {
		return a + b;
	}

	public int sumOfNumbers(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.sumOfNumbers(1, 2, 3));
		
		System.out.println("Bharath");
		System.out.println(1234);
		System.out.println(true);

	}

}
