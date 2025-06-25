package basics;

import java.util.logging.Logger;

public class PrintStatements_HelloWorld {

	public static void main(String[] args) {
		
		//Print the data and go to next line
		System.out.println("Hello, World!");
		
		//Print the data and stay on same line
		System.out.print("Hello, ");
		System.out.print("World!");
		System.out.println();
		
		//Normal way of Printing dynamic values
		System.out.println("Emp Name is Teja and Age is 30 and Visa Status is true");
		System.out.println("Emp Name is Alok and Age is 32 and Visa Status is false");
		
		//Formatted way of Printing dynamic values
		System.out.printf("Emp Name is %s and Age is %d and Visa Status is %b","Teja",30,true);
		System.out.println();

		//Normal way of printing message
		System.err.println("Line Number 23 there is a error");
		
		//Logging the messages
		Logger.getLogger("").info("Currently Line number 30 is executing, Program is going well");
		Logger.getLogger("").warning("Currently Line number 31 is executing, There is a warning");
		

	}
	

}
