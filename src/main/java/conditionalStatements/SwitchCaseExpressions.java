package conditionalStatements;

public class SwitchCaseExpressions {

	public static void main(String[] args) {

		String day = "Monday";

		String result = switch (day) {

		case "Monday", "Tuesday", "Wednesday", "Thursday" -> "Today is Weekday";
		case "Friday" -> "Today is TGIF";
		case "Saturday", "Sunday" -> "Today is Weekend";
		default -> "Invalid day";		
		};
		
		System.out.println(result);

	}

}
