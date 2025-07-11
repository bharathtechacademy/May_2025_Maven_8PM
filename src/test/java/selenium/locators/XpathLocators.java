package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
	
	//Xapth ==> XML Path
	
	// Absolute Xpath ==> Full Xpath ==> Starts with / ==> Starting from Html tag to till target element all html tags to be considered (Example: /html/body/div[1]/div[1]/a[2]/img)
	
	// Relative Xpath ==> Starts with //
	
	/****************BASIC - LEVEL 1*******************/	
	// Syntax 1 : //tagName[@attribute='attribute-value']
	// Syntax 2:  //tagName[text()='text-value']
	
	/****************LEVEL 2 - with contains / starts-with *******************/
	// Syntax 3 : //tagName[contains(@attribute,'partial-attribute-value')]
	// Syntax 4:  //tagName[contains(text(),'partial-text-value')]
	
	// Syntax 5 : //tagName[starts-with(@attribute,'partial-attribute-value')]
	// Syntax 6:  //tagName[starts-with(text(),'partial-text-value')]
	
	/****************LEVEL 3 - combine multiple attributes & text values using 'and'  *******************/
	// Syntax 7 : //tagName[@attribute1='attribute-value' and @attribute2='attribute-value' and text()='text-value']
		
	/****************LEVEL 4 - Advanced Xpaths with Relationships*******************/	
	//referenceElementXpath/relationship::targetElementXpath
	
	//child
	//parent
	//ancestor
	//following-sibling
	//preceding-sibling
	//following
	//preceding
	// ==> with in the family
	// / ==> child
	
	// target --> sibling --> parent --> ancestor --> ancestor's parent 
	
	
	// ancestor : //ul[@class='leftmenu']
	// parent : //li
	// target : //a[text()='Services']
	
	
	//ul[@class='leftmenu']/child::li/child::a[text()='Services']
	//ul[@class='leftmenu']//a[text()='Services']
	

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
		
//		6. Locate logo element by using Xpath Syntax3
		driver.findElement(By.xpath("//img[contains(@src,'logo')]"));
		
//		7. Locate caption element by using Xpath Syntax4
		driver.findElement(By.xpath("//p[contains(text(),'the difference')]"));
		
//		8. Locate logo element by using Xpath Syntax5
		driver.findElement(By.xpath("//img[starts-with(@src,'images/logo')]"));
		
//		9. Locate caption element by using Xpath Syntax6
		driver.findElement(By.xpath("//p[starts-with(text(),'Experience')]"));
		
//		10. Locate "Services" element by using CSS selector
		driver.findElement(By.xpath(""));

		
		
		

	}

}
