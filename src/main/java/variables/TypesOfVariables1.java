package variables;

public class TypesOfVariables1 {
	
	// Types of Variables
	
	// 1. Local Variable  ==> The variable declared inside the method/block
	// 2. Instance Variable ==> The variable declared inside the class but outside of method/block
	// 3. Global/Static Variable ==> The variable declared inside the class but outside of method/block along with static keyword at the beginning
	
	
	String topic2 = "Database"; // Instance variable
	
	static String topic3 = "Java"; // Static/Global variable
	
	public static void main(String[] args) {		
		String topic1 = "Selenium";		//Local Variable
		System.out.println(topic1);
		
		TypesOfVariables1 obj = new TypesOfVariables1();
		System.out.println(obj.topic2);
		
		System.out.println(topic3);
	}
	

}
