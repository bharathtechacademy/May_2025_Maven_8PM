package jumping.statements;

public class JumpingStatements {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			if (i > 4 && i < 7) {
				// break; //break entire loop
				continue; //skip the current iteration only
			}
			
			System.out.println(i);	

		}

	}

}
