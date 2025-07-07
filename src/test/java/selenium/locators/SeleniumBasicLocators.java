package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicLocators {
	
//	1. id  ==> id attributes value of element
//	2. name ==> name attributes value of element
//	3. className  ==> class attributes value of element
//	4. tagName  ==> Html tag of element
//	5. linkText  ==> text value of hyperlink element
//	6. partialLinkText ==> partial text value of hyperlink element
	
	
	// Search for Unique Locator
	
	// // for Html tag
	// [] for attribute & it's value
	// direct search for text value

	public static void main(String[] args) {
		
//		1. Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Enter URL and Launch the application (Google)
		driver.get("https://www.google.co.in/");
		
//		4. Locate "Google search text box" by using "id" locator.
		driver.findElement(By.id("APjFqb"));
		
//		5. Locate "Google search text box" by using "name" locator.
		driver.findElement(By.name("q"));
		
//		6. Locate "Google search text box" by using "className" locator.
		driver.findElement(By.className("gLFyf"));
		
//		7. Locate "Google search text box" by using "tagName" locator.
		driver.findElement(By.tagName("textarea"));
		
//		8. Locate 'how search works' link by using link text locator.
		driver.findElement(By.linkText(" How Search works "));
		
//		9. Locate 'how search works' link by using partial link text locator.
		driver.findElement(By.partialLinkText("How Search"));
		


	}

}
