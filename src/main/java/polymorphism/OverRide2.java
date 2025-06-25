package polymorphism;

public class OverRide2 extends OverRide1{
	
	
	String name = "Java";
	
	public void printName(String name) {
		System.out.println(name);
//		System.out.println(new OverRide2().name);
//		System.out.println(new OverRide1().name);
		
		System.out.println(this.name);
		System.out.println(super.name);
	}
	
	public void calculateInterest() {
		System.out.println("Old Logic");
	}

	public static void main(String[] args) {
		
		OverRide2 obj = new OverRide2();
		obj.calculateInterest();
		obj.printName("AI");
	}

}
