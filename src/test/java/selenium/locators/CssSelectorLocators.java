package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocators {
	
	// Basic CssSelector Syntaxes
	
	// 1. tagName#id
	// 2. tagName.className
	// 3. tagName[attribute='attributes-value']

	public static void main(String[] args) {

//		1. Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Enter URL and Launch the application (Google)
		driver.get("https://www.google.co.in/");
		
//		4. Locate "Google search text box" by using "cssSelector" locator syntax 1
		driver.findElement(By.cssSelector("textarea#APjFqb"));
		
//		5. Locate "Google search text box" by using "cssSelector" locator syntax 2
		driver.findElement(By.cssSelector("textarea.gLFyf"));
		
//		3. Locate "Google search text box" by using "cssSelector" locator syntax 3
		driver.findElement(By.cssSelector("textarea[title='Search']"));
		
		

	}

}
