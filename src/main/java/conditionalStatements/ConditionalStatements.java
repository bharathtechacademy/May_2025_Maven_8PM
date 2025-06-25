package conditionalStatements;

public class ConditionalStatements {
	
	//ConditionalStatements ==> Conditions + Statements ==> Writing the statements along with conditions.

//	(condition){
//		//statements
//	}

	
	// 2 Types of conditional statements
	
	// if-else conditional statements  ==> when we don't the result of condition
	// switch-case conditional statements  ==> when we know the result and we want to choose one option among many.
	
	public static void main(String[] args) {
		
		double percentage = 72.83;
		
		if (percentage >= 60) {
			System.out.println("You got First Class");	
			
			if (percentage >= 85) {
				System.out.println("Hey , You are eligible for Gold Medal");
			} else {
				System.out.println("But , You are not eligible for Gold Medal");
			}	
			
		} else if (percentage >= 50 && percentage < 60) {
			System.out.println("You got Second Class");
		} else if (percentage >= 40 && percentage < 50) {
			System.out.println("You got Third Class");
		} else {
			System.out.println("Sorry, You Failed Bro");
		}
		

	}

}
