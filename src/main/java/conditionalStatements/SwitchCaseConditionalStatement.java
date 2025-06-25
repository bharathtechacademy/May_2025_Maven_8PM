package conditionalStatements;

public class SwitchCaseConditionalStatement {

//	switch(option) {
//	
//	case option1:
//		//case 1 code
//		break;
//		
//	case option2:
//		//case 1 code
//		break;
//	case option3:
//		//case 1 code
//		break;
//	default:
//		//default code	
//	}

	public static void main(String[] args) {

		String day = "Friday";

		switch (day) {

		case "Monday":
			System.out.println("Today is Weekday");
			break;
		case "Tuesday":
			System.out.println("Today is Weekday");
			break;
		case "Wednesday":
			System.out.println("Today is Weekday");
			break;
		case "Thursday":
			System.out.println("Today is Weekday");
			break;
		case "Friday":
			System.out.println("Today is TGIF");
			break;
		case "Saturday":
			System.out.println("Today is Weekend");
			break;
		case "Sunday":
			System.out.println("Today is Weekend");
			break;
		default:
			System.out.println("Invalid day");

		}

	}

}
