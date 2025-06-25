package abstractNonAccessMod;

public class AbsClass2 extends AbsClass1{

	public static void main(String[] args) {
//		AbsClass1 obj = new AbsClass1();

	}

	@Override
	public void login(String user, String pass) {
		System.out.println("Login Successful with"+user+","+pass);		
	}

}
