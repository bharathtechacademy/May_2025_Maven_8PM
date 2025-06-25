package access.modifiers1;

 public class AccessMod1 {
	
	// 200 details
	
	// 3-4 details as colleague
	// 30-40 details as manager
	// 200 details as HR

	private String name = "Anil";

	public void printEmpId() {
		System.out.println(1234);
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public static void main(String[] args) {
		AccessMod1 obj = new AccessMod1();
		System.out.println(obj.name);
		obj.printEmpId();
	}

}
