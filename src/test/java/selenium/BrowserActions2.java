package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserActions2 {

	public static void main(String[] args) {
		
//		Create browser settings/browser options
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--window-size=1920,1080");
		options.addArguments("--lang=en-US");
		options.addArguments("--disable-notifications");
		options.addArguments("--allow-notifications");
		options.addArguments("--ignore-certificate-error");
	
//		1. Launch the Browser window (Browser = Chrome)    
		WebDriver driver = new ChromeDriver(options);		
		
//		2. Maximize the browser window 
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies 
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://www.google.co.in/)   
		driver.get("https://www.google.co.in/");

	}

}
