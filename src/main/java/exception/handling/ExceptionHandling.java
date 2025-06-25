package exception.handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {
	
	// Error  ==> An issue occurred during the run time and we cannot control the same .
	// Exception ==> An issue occurred because of logical error and we can control the same using different techniques.
	
	// ExceptionHandling ==> Handle the Exceptions / Control the Exceptions
	
	// 1. throws declaration ==> when we are sure about the exception
	// 2. try/catch exception handling ==> when we are not sure about the exception
	// 3. throw an custom exception ==> when there is no exception, create one 

	public static void main(String[] args) throws InterruptedException, FileNotFoundException{		
		System.out.println("Bharath");
		Thread.sleep(2000);
		System.out.println("ABC");
		Thread.sleep(3000);
		System.out.println("XYZ");
	}

}
