package loops;

public class WhileLoop {

//	 while (condition1) {	
//		//condition to break
//		//code to iterate
//		//interval (optional)		
//	}

	public static void main(String[] args) {

		int i = 1;

		while (i > 0) {

			boolean isPageDisplayed = false;

			if (i == 100 || isPageDisplayed) {
				break; // stop the loop
			}
			System.out.println("Refresh the Page");
			i++;
		}

	}

}
