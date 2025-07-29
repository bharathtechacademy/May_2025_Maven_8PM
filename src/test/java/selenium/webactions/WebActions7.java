package selenium.webactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions7 {

	public static void main(String[] args){
		//1. Launch browser window(Chrome)   
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//2. Maximize the browser window
		driver.manage().window().maximize();
		
		//3.Launch the application
		driver.get("https://www.google.co.in/");
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));		
		searchBox.sendKeys("Aakash");
		
		driver.navigate().refresh();
		
		searchBox.sendKeys("ABC");
		
		
		//Locate host element		
		WebElement shadowHost = driver.findElement(By.cssSelector("div#shadow-host"));		
		
		// Get the root element that you want to perform the action
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement shadowRootButton = (WebElement)js.executeScript("return arguments[0].shadowRoot.querySelector('button#my-btn')", shadowHost);
		
		//Click on the shadow dom element
		shadowRootButton.click();
		System.out.println("Clicked on button");


	}

}
