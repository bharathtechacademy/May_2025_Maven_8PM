package selenium.webactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions9 {

	public static void main(String[] args) {
		
//		1. Launch chrome browser window
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application (https://beautysense.ca/)
		driver.get("https://beautysense.ca/");		

//		wait for header
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[text()='We value your privacy']"), 0));
		
//		5. Locate accept button element
		WebElement acceptButton = driver.findElement(By.xpath("//div[text()='Accept']"));		
		acceptButton.click();
		
//		6. Locate menu and click on it
		WebElement menu = driver.findElement(By.xpath("//a[contains(text(),'Made in')]"));
		menu.click();
		
//		7. close the browser
		driver.quit();

	}

}
