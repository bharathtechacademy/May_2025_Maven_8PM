package assignments;

public class Assignment7_ConditionalStatements {
	public static void main(String[] args) {
		// Customer details
		String customerName = "John Doe";           // Customer's name
		int creditScore = 720;                      // Customer's credit score
		double income = 55000.0;                    // Customer's annual income
		boolean isEmployed = true;                  // Employment status
		double debtToIncomeRatio = 35.0;            // Debt-to-Income ratio in percentage

		// Loan evaluation logic
		if (creditScore > 750) {
			// Automatically approve loan for excellent credit score
			System.out.println(customerName + " is eligible for the loan (automatically approved).");
		} else if (creditScore >= 650 && creditScore <= 750) {
			// For moderate credit score, further checks are required
			if (income >= 50000.0) {
				// Check if income is above the threshold
				if (isEmployed) {
					// Check if the customer is employed
					if (debtToIncomeRatio < 40.0) {
						// Check if DTI ratio is acceptable
						System.out.println(customerName + " is eligible for the loan.");
					} else {
						// DTI ratio too high
						System.out.println(customerName + " is not eligible for the loan (DTI ratio too high).");
					}
				} else {
					// Customer is unemployed
					System.out.println(customerName + " is not eligible for the loan (unemployed).");
				}
			} else {
				// Income is below the required limit
				System.out.println(customerName + " is not eligible for the loan (income below $50,000).");
			}
		} else {
			// Credit score is too low for consideration
			System.out.println(customerName + " is not eligible for the loan (credit score below 650).");
		}
	}
}
