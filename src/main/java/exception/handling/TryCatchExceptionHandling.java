package exception.handling;

public class TryCatchExceptionHandling {

	public static void main(String[] args) {

		String[] newEmpNames = new String[4];
		try {
			newEmpNames[0] = "Teja";
			newEmpNames[1] = "Afreen";
			newEmpNames[2] = "Arayan";
			newEmpNames[3] = "Bharath";
			newEmpNames[4] = "Apurva";
			System.out.println(newEmpNames[3]);
		} catch (Exception e) {
			newEmpNames[4] = "Aakash";
			System.out.println(newEmpNames[3]);
		} finally {
			System.out.println("Execution Completed");
		}

	}

}
