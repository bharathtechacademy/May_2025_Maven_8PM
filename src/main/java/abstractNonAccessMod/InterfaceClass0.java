package abstractNonAccessMod;

public interface InterfaceClass0 {

	// 100% abstract class

	public void launchApp();
	
	default void getDarkTheme() {
		System.out.println("This is not applicable");
	}
	
	static void closeAlert() {
		System.out.println("Alert is closed");
	}

}
