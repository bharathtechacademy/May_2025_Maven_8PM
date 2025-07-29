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

public class WebActions5 {

	public static void main(String[] args){
		//1. Launch browser window(Chrome)   
		WebDriver driver = new ChromeDriver();
		
		//2. Maximize the browser window
		driver.manage().window().maximize();
		
		//3.Launch the application
		driver.get("https://www.orangehrm.com/en/contact-sales");
		
		//4.Locate elements		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//a[text()='Solutions']"), 0));
		
		
		WebElement solutions = driver.findElement(By.xpath("//a[text()='Solutions']"));		
		Actions action = new Actions(driver);		
		action.moveToElement(solutions).perform();
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//li[contains(text(),'People Management')]"), 0));
		
		WebElement peopleMgmt = driver.findElement(By.xpath("//li[contains(text(),'People Management')]"));
		action.moveToElement(solutions).perform();
		
//		peopleMgmt.click();
//		action.moveToElement(peopleMgmt).perform();


	}

}
