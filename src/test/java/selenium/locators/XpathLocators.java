package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
	
	//Xapth ==> XML Path
	
	// Absolute Xpath ==> Full Xpath ==> Starts with / ==> Starting from Html tag to till target element all html tags to be considered (Example: /html/body/div[1]/div[1]/a[2]/img)
	
	// Relative Xpath ==> Starts with //
	
	// Syntax 1 : //tagName[@attribute='attribute-value']
	// Syntax 2:  //tagName[text()='text-value']
	

	public static void main(String[] args) {
		
//		1. Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Enter URL and Launch the application (Parabank)
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		4. Locate logo element by using Xpath Syntax1
		driver.findElement(By.xpath("//img[@class='logo']"));
		
//		5. Locate caption element by using Xpath Syntax2
		driver.findElement(By.xpath("//p[text()='Experience the difference']"));
		

	}

}
