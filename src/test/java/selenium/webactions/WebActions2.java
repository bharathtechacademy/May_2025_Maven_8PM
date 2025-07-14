package selenium.webactions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions2 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		//1. Launch browser window(Chrome)   
		driver = new ChromeDriver();
		
		//2. Maximize the browser window
		driver.manage().window().maximize();
		
		//3. Delete all the cookies    
		driver.manage().deleteAllCookies();
		
		//4. Enter URL and Launch the application (https://demoqa.com/automation-practice-form)   
		driver.get("https://demoqa.com/automation-practice-form");
		
		//5. Wait for Page-load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//6. Enter First name and Last name    
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		
		firstName.sendKeys("Bharath");
		lastName.sendKeys("Reddy");
		
		//7. Enter Email           
		WebElement emailTxtb = driver.findElement(By.xpath("//input[@id='userEmail']"));
		emailTxtb.sendKeys("BharathTechAcademy@gmail.com");

		//8. Select Gender (Female)   
		selectGender("Male");
		
		//9. Enter mobile number 
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobileNumber.sendKeys("9553220022");
		
		//10.Select DOB (1-Feb-1991) 
		selectDOB("1","February","1991");
		
		//11.Search and Select Computer Science 
		selectSubject("Computer Science");
		
		//12.Select Hobbies as Sports and Reading  
		String [] hobbies = {"Sports","Reading"};
		selectHobbies(hobbies);
		
		//13.Upload photo  
		String filePath = System.getProperty("user.dir")+"\\Files\\Photo.png";
		WebElement uploadButton = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		uploadButton.sendKeys(filePath);
		
		//14.Submit Details    
		WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", submitButton);
		
		//15. Close browser window
		driver.quit();
	}
	
	public static void selectGender(String option) {
		WebElement gender = driver.findElement(By.xpath("//label[text()='"+option+"']"));
		gender.click();
	}
	
	public static void selectHobbies(String[] options) {
		for (String option : options) {
			WebElement hobby = driver.findElement(By.xpath("//label[text()='" + option + "']"));
			if (!hobby.isSelected()) {
				hobby.click();
			}
		}
	}
	
	public static void selectDOB(String date, String month,String year) {
		//Click on the dob field
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();
		
		//wait for the calendar
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//select[@class='react-datepicker__month-select']"), 0));
		
		//Select month
		WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select selectMonth = new Select(monthDropdown);
		selectMonth.selectByVisibleText(month);
		
		//Select year
		WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select selectYear = new Select(yearDropdown);
		selectYear.selectByVisibleText(year);
		
		//Select date  
		WebElement dateField = driver.findElement(By.xpath("//div[contains(@aria-label,'"+month+"') and text()='"+date+"']"));
		dateField.click();
		
		
	}
	
	public static void selectSubject(String subjectName) {
		WebElement subjectInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		
		//Scroll till the subjects input field is visible
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", subjectInput);
		
		// Enter the subject name
		Actions action = new Actions(driver);
		action.sendKeys(subjectInput,subjectName).perform();
		
		// Wait until option is getting displayed to select		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[text()='"+subjectName+"' and contains(@id,'option')]"), 0));
		
		//Click on the element
		WebElement suggestion = driver.findElement(By.xpath("//div[text()='"+subjectName+"' and contains(@id,'option')]"));
		suggestion.click();
		
	}

}
