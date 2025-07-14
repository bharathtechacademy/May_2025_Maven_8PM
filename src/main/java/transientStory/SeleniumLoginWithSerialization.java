package transientStory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.Scanner;

// User class for storing login credentials
class User implements Serializable {
	String username;
	// Uncomment next line to see difference with transient
	// transient String password;
	transient String password; // Change to transient to test
}

public class SeleniumLoginWithSerialization {

	static final String FILE_PATH = "user.ser";

	public static void main(String[] args) throws Exception {
		// Step 1: Create and serialize the User object
		User user = new User();
		user.username = "invalidUser";
		user.password = "invalidPass"; // will be ignored if marked transient

		serializeUser(user); // save to file

		// Step 2: Deserialize the User object
		User deserializedUser = deserializeUser();

		// Step 3: If password is null (due to transient), ask user to re-enter
		if (deserializedUser.password == null) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Password was not saved. Please enter password again: ");
			deserializedUser.password = scanner.nextLine();
		}

		// Step 4: Launch browser and perform login
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

		// Step 5: Locate and fill username and password
		WebElement usernameTxtb = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordTxtb = driver.findElement(By.xpath("//input[@name='password']"));
		usernameTxtb.sendKeys(deserializedUser.username);
		passwordTxtb.sendKeys(deserializedUser.password);

		// Step 6: Click on login
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
		loginButton.click();

		// Wait and close
		Thread.sleep(5000);
		driver.quit();
	}

	// Serialize the user object to file
	static void serializeUser(User user) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
			out.writeObject(user);
			System.out.println("✅ User serialized successfully.");
		} catch (IOException e) {
			System.err.println("❌ Serialization failed: " + e.getMessage());
		}
	}

	// Deserialize the user object from file
	static User deserializeUser() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
			User user = (User) in.readObject();
			System.out.println("✅ User deserialized successfully.");
			return user;
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("❌ Deserialization failed: " + e.getMessage());
			return null;
		}
	}
}
