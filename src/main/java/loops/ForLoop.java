package loops;

public class ForLoop {
	
//	for(condition1 ; condition2;condition3) {
//		//code to repeat
//	}
	
//	condition1 ==> where to start the loop
//	condition2 ==> where to end the loop
//	condition3 ==> interval between each iteration

	public static void main(String[] args) {
		
		for(int i=1; i<=10 ; i++) {
			System.out.println(i);
			
			for(int j=1; j<=10; j++) {
				System.out.println(i+""+j);				
			}
		}
		

	}

}
