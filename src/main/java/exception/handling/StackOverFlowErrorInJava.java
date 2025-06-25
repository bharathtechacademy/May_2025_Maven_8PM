package exception.handling;

public class StackOverFlowErrorInJava {	
	
	//Stack overflow error
	public static void printName() {
		printName();
	}

	public static void main(String[] args) {
		printName();
	}

}
