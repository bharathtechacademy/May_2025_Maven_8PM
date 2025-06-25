package basics;

public class DocumentationComments {

	public static void main(String[] args) {
		System.out.println(calculateInterest(100000, 9.5, 24));
	}

	/**
	 * This is the common method to provide the total interest amount 
	 * based on the FD i have deposited in the bank
	 * 
	 * @param amount
	 * @param interest
	 * @param months
	 * 
	 * @return total interest amount
	 * 
	 * @author Bharath (BharathTechAcademy@gmail.com)
	 * @version 1.2
	 * 
	 * The logic behind this method is {(amount * months * interest / 100) / 12;}
	 */
	public static double calculateInterest(int amount, double interest, int months) {
		double intrst = (amount * months * interest / 100) / 12;
		return intrst;
	}

}
