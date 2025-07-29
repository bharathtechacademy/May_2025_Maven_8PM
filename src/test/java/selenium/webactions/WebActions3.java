package selenium.webactions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebActions3 {

	public static void main(String[] args) {
		//1. Launch browser window(Chrome)   
		WebDriver driver = new ChromeDriver();
		
		//2. Maximize the browser window
		driver.manage().window().maximize();
		
		//3. Delete all the cookies    
		driver.manage().deleteAllCookies();
		
		//4. Enter URL and Launch the application (https://demoqa.com/alerts)   
		driver.get("https://demoqa.com/alerts");
		
//		4.Locate Alert buttons
		WebElement infoAlertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		WebElement confirmationAlertButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		WebElement promptAlertButton = driver.findElement(By.xpath("//button[@id='promtButton']"));

				
//		5.Launch Information alert
		infoAlertButton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
//		switch to alert and store alert details in to variable
		Alert infoAlert = driver.switchTo().alert();
				
//		6.Print Alert message
		System.out.println(infoAlert.getText());		
				
//		7.Click on OK button
		infoAlert.accept();
				
//		8.Launch confirmation alert
		confirmationAlertButton.click();
		wait.until(ExpectedConditions.alertIsPresent());
		
//		switch to alert and store alert details in to variable
		Alert confirmationAlert = driver.switchTo().alert();
		
//		9.Print Alert message
		System.out.println(confirmationAlert.getText());		

//		10.Click on Cancel button
		confirmationAlert.dismiss();
				
//		11.Launch prompt alert with dialog box alert
		promptAlertButton.click();
		wait.until(ExpectedConditions.alertIsPresent());
		
//		switch to alert and store alert details in to variable
		Alert promptAlert = driver.switchTo().alert();

//		12.Print message
		System.out.println(promptAlert.getText());		

//		13.Enter Text in Alert
		promptAlert.sendKeys("Approved-No Issues");
		
//		14.Click on OK button
		promptAlert.accept();


	}

}
