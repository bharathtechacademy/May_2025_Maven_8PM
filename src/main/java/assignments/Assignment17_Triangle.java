package assignments; 

// Print a right-aligned triangle of stars
public class Assignment17_Triangle {

	public static void main(String[] args) {
		
		int n = 5; // Number of rows for the triangle
		
		// Outer loop: runs from 1 to n (controls the rows)
		for (int i = 1; i <= n; i++) {
			
			// Inner loop 1: prints spaces before the stars to right-align the triangle
			for (int j = i; j < n; j++) {
				System.out.print(" "); // Print space
			}
			
			// Inner loop 2: prints stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*"); // Print star
			}
			
			// Move to the next line after each row
			System.out.println();
		}
	}
}
