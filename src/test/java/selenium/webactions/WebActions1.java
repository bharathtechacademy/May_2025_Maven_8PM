package selenium.webactions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebActions1 {
	static WebDriver driver ;

	public static void main(String[] args) {
//		1. Launch chrome browser window
		driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application (https://parabank.parasoft.com/parabank/index.htm)
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Verify application title
		String actualTitle = driver.getTitle();
		String expTitle = "ParaBank | Welcome | Online Banking";
		Assert.assertEquals(actualTitle, expTitle);
		
//		6. Verify application logo
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");
		
//		7. Verify application caption
		WebElement caption = driver.findElement(By.xpath("//p[@class='caption']"));
		String actualCaption =caption.getText();
		String expCaption = "Experience the difference";
		Assert.assertEquals(actualCaption, expCaption);

//		8. Enter Invalid credentials in Username and Password textboxes
		WebElement usernameTxtb = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordTxtb = driver.findElement(By.xpath("//input[@name='password']"));
		
//		clear the textbox
		usernameTxtb.clear();
		passwordTxtb.clear();

		usernameTxtb.sendKeys("Inavalid User");
//		passwordTxtb.sendKeys("Invalid Pass");
		
//		9. Click on Login Button
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
		loginButton.click();
		
//		wait for error message
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[@class='error']"), 0));
		
//		10. Verify error message is displayed (The username and password could not be verified.)
		WebElement errorMessage = driver.findElement(By.xpath("//p[@class='error']"));
		String actualError = errorMessage.getText();
		String expError ="Please enter a username and password.";
		Assert.assertEquals(actualError, expError);
		
//		11. Click on Admin page link
		WebElement adminLink = driver.findElement(By.xpath("//a[text()='Admin Page']"));
		adminLink.click();
		
//		12. Wait for admin page
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[contains(text(),'Administration')]"), 0));
		
//		13. Select Data access mode as ' SOAP'
		selectDataAccessMode("soap");
		
//		14. Scrolldown till Loan provider
		WebElement loanProvider = driver.findElement(By.xpath("//select[@name='loanProvider']"));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", loanProvider);
		
//		15. Select Loanprovider as 'Web Service'
		Select s = new Select(loanProvider);
		s.selectByVisibleText("Web Service");
		
//		16. Click on Submit button
		WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
		submitButton.click();
		
//		17.wait for Successful submission message
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//b[text()='Settings saved successfully.']"), 0));

//		18.Click on Services Link
		WebElement servicesLink = driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));
		servicesLink.click();

//		19.Wait for Services page
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[text()='Bookstore services:']"), 0));
		
//		20.Scrolldown till Bookstore services
		WebElement bookStoreServices = driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
		js.executeScript("arguments[0].scrollIntoView(true);", bookStoreServices);
		
//		21.Get total rows, columns in the bookstore service table
		List<WebElement> rows = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tr[1]//td"));
		
		int totalRows = rows.size();
		int totalColumns = columns.size();
		
//		22.Get Column headers of book store services table
//		23.Get all the data from book store service table
		
		for (int r =1; r<=totalRows ; r++) {
			for(int c=1; c<=totalColumns ; c++) {
				WebElement cell = driver.findElement(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tr["+r+"]//td["+c+"]"));
				String cellValue = cell.getText();
				System.out.println("Row "+r+", Column "+c+" Value is : "+cellValue);
			}
		}
		
//		24.Close browser window
		driver.quit();
		
	}
	
	public static void selectDataAccessMode(String option) {
		WebElement dbaMode = driver.findElement(By.xpath("//input[@value='"+option+"']"));
		dbaMode.click();
	}

}
