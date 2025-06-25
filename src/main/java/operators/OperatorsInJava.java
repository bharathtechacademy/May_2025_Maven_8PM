package operators;

public class OperatorsInJava {

	public static void main(String[] args) {
		
		//Operators ==> Special Chars used to perform specific Operation in Programming
		
//		1. Arithmetic Operators ==> to perform mathematical operations ( + , -, * , / , % (modulus) , ++ (increment), --(decrement))
		System.out.println("***********Arithmetic Operators***********");
		int a = 10;
		int b = 20;
		
		System.out.println(b%a);
		
		//++ (increment) ==> increase the value by 1 ==> a++ ==> a= a+1;
		//--(decrement) ==> decrease the value by 1 ==> b-- ==> b= b-1;
		
		//a++ ==> post-increment ==> adding ++ after the variable ==> first JVM will execute the line with old value and increase the value at the end.
		System.out.println(a++);
		System.out.println(b--);
		
		//++a ==> pre-increment ==> adding ++ before the variable ==> first JVM will increase the value then it will execute the statement.
		System.out.println(++a);
		System.out.println(--b);
		
//		2. Assignment Operators ==> to assign value to variables (= ,+=, -=, *=, /=, %=)		
		System.out.println("************Assignment Operators***********");
		
		int c = 10;
		
		c+=20;//c=c+20;
		System.out.println(c);
		
		c-=5;
		System.out.println(c);
		
		c*=5;
		System.out.println(c);
		
		c/=25;
		System.out.println(c);
		
		c%=5;
		System.out.println(c);
		
//		3. Conditional / Comparison Operators ==> to compare primitive data types (> , <, >=, <=, ==, != )
		System.out.println("************Conditional Operators***********");
		
		int d = 10;
		int e = 10;
		
		System.out.println(d==e);//true
		System.out.println(d!=e);//false
		System.out.println(d>e);//false
		System.out.println(d<e);//false
		
//		4. Logical Operators ==> will be used to build the logics ( &&(and) , ||(or) , !(not) )
		System.out.println("************Logical Operators***********");		
		
		int x = 10;
		int y = 20;
		int z = 10;
		
		System.out.println(x>y && x==z); //false && true == false
		System.out.println(x>y || x==z); //false || true == true
		System.out.println(!(x>y || x==z)); //not (false || true) == not (true) ==false
		
//		5. Ternary Operator ==> shot form of conditional statements ==> ?
		System.out.println("************Ternary Operators***********");
		
//		(condition) ? true : false;
		
		int i =10;
		int j =20;
		
		int maxValue = (i>j) ? i:j;
		System.out.println(maxValue);
		
		String result = (i>j) ? "10 is max value" :"20 is max value";
		System.out.println(result);

	}

}
