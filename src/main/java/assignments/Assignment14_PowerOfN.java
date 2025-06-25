package assignments; 

//Compute power of a number 'x' raised to 'n'

public class Assignment14_PowerOfN { 

	public static void main(String[] args) { 

		double x = 10; // Base number (can be any real number)
		int n = -1;    // Exponent (can be negative, zero, or positive)
		double result = 1; // Variable to store the final result, initialized to 1

		// Case 1: If exponent is zero, any number raised to power 0 is 1
		if (n == 0) {
			result = 1;
		}

		// Case 2: If exponent is negative
		if (n < 0) {
			x = 1 / x; // Invert the base (e.g., 10 becomes 1/10)
			n = -n;    // Convert the exponent to positive for easier calculation
		}

		// Loop to multiply the base 'x', 'n' times
		for(int i = 0; i < n; i++) {
			result = result * x; // Multiply result with base 'x' in each iteration
		}
		
		System.out.println(result); // Print the final result
	}
}
