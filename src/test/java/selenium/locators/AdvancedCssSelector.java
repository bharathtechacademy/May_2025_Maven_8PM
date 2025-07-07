package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Basic CssSelector Syntaxes

	// 1. tagName#id
	// 2. tagName.className
	// 3. tagName[attribute='attributes-value']

	// Advanced Css Selector

	// Syntax 4: ancestor's parent Element > ancestorElement > parentElement > targetElement


	//   ul[class='leftmenu'] >  li > a[href='services.htm']

public class AdvancedCssSelector {

	public static void main(String[] args) {
//		1. Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Enter URL and Launch the application (Parabank)
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		4. Locate services element by using CSS selector
		driver.findElement(By.cssSelector("ul[class='leftmenu'] >  li > a[href='services.htm']"));
		
		

	}

}
